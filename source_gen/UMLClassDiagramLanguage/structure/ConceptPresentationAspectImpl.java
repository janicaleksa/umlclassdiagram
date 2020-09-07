package UMLClassDiagramLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Aggregation;
  private ConceptPresentation props_Association;
  private ConceptPresentation props_AssociationClass;
  private ConceptPresentation props_Attribute;
  private ConceptPresentation props_Cardinality;
  private ConceptPresentation props_Class;
  private ConceptPresentation props_ClassDiagramTemplate;
  private ConceptPresentation props_ClassReference;
  private ConceptPresentation props_Composition;
  private ConceptPresentation props_Inheritance;
  private ConceptPresentation props_Method;
  private ConceptPresentation props_MultiParameters;
  private ConceptPresentation props_One;
  private ConceptPresentation props_Parameter;
  private ConceptPresentation props_Property;
  private ConceptPresentation props_Relation;
  private ConceptPresentation props_Scope;
  private ConceptPresentation props_Type;
  private ConceptPresentation props_TypeReference;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Aggregation:
        if (props_Aggregation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Aggregation type of relation");
          cpb.presentationByName();
          props_Aggregation = cpb.create();
        }
        return props_Aggregation;
      case LanguageConceptSwitch.Association:
        if (props_Association == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Association type of realation");
          cpb.presentationByName();
          props_Association = cpb.create();
        }
        return props_Association;
      case LanguageConceptSwitch.AssociationClass:
        if (props_AssociationClass == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Association class type of relationship");
          cpb.presentationByName();
          props_AssociationClass = cpb.create();
        }
        return props_AssociationClass;
      case LanguageConceptSwitch.Attribute:
        if (props_Attribute == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Attribute property");
          cpb.presentationByName();
          props_Attribute = cpb.create();
        }
        return props_Attribute;
      case LanguageConceptSwitch.Cardinality:
        if (props_Cardinality == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Cardinality of relation");
          props_Cardinality = cpb.create();
        }
        return props_Cardinality;
      case LanguageConceptSwitch.Class:
        if (props_Class == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Class of entity");
          cpb.presentationByName();
          props_Class = cpb.create();
        }
        return props_Class;
      case LanguageConceptSwitch.ClassDiagramTemplate:
        if (props_ClassDiagramTemplate == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Template for class diagram");
          cpb.presentationByName();
          props_ClassDiagramTemplate = cpb.create();
        }
        return props_ClassDiagramTemplate;
      case LanguageConceptSwitch.ClassReference:
        if (props_ClassReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Reference for holding class instance");
          cpb.presentationByReference(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699da096L, 0x61a8fafa699da097L, "target", "", "");
          props_ClassReference = cpb.create();
        }
        return props_ClassReference;
      case LanguageConceptSwitch.Composition:
        if (props_Composition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Composition type of relation");
          cpb.presentationByName();
          props_Composition = cpb.create();
        }
        return props_Composition;
      case LanguageConceptSwitch.Inheritance:
        if (props_Inheritance == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Extension type of relation");
          cpb.presentationByName();
          props_Inheritance = cpb.create();
        }
        return props_Inheritance;
      case LanguageConceptSwitch.Method:
        if (props_Method == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Method property");
          cpb.presentationByName();
          props_Method = cpb.create();
        }
        return props_Method;
      case LanguageConceptSwitch.MultiParameters:
        if (props_MultiParameters == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Multi parameter");
          cpb.presentationByName();
          props_MultiParameters = cpb.create();
        }
        return props_MultiParameters;
      case LanguageConceptSwitch.One:
        if (props_One == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("One type of relation");
          cpb.rawPresentation("one");
          props_One = cpb.create();
        }
        return props_One;
      case LanguageConceptSwitch.Parameter:
        if (props_Parameter == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Parameter of method");
          cpb.presentationByName();
          props_Parameter = cpb.create();
        }
        return props_Parameter;
      case LanguageConceptSwitch.Property:
        if (props_Property == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Property of class");
          props_Property = cpb.create();
        }
        return props_Property;
      case LanguageConceptSwitch.Relation:
        if (props_Relation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Abstract concept for describing relation");
          props_Relation = cpb.create();
        }
        return props_Relation;
      case LanguageConceptSwitch.Scope:
        if (props_Scope == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Scope for cardinality");
          cpb.rawPresentation("scope");
          props_Scope = cpb.create();
        }
        return props_Scope;
      case LanguageConceptSwitch.Type:
        if (props_Type == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Concept of type");
          cpb.presentationByName();
          props_Type = cpb.create();
        }
        return props_Type;
      case LanguageConceptSwitch.TypeReference:
        if (props_TypeReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Reference for holding type");
          cpb.presentationByReference(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69aaf379L, 0x61a8fafa69b23ccbL, "target", "", "");
          props_TypeReference = cpb.create();
        }
        return props_TypeReference;
    }
    return null;
  }
}