package UMLClassDiagramLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Aggregation_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Association_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new AssociationClass_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Attribute_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Class_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ClassDiagramTemplate_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ClassReference_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Composition_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Inheritance_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Method_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new MultiParameters_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new One_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Parameter_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new Property_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new Scope_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new Type_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new TypeReference_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        if (true) {
          switch (editorComponentId) {
            case "UMLClassDiagramLanguage.editor.FirstCardinality_Component":
              return Collections.<ConceptEditorComponent>singletonList(new FirstCardinality_Component());
            case "UMLClassDiagramLanguage.editor.FirstClassAssociation_Component":
              return Collections.<ConceptEditorComponent>singletonList(new FirstClassAssociation_Component());
            case "UMLClassDiagramLanguage.editor.MandatoryCardinality_Component":
              return Collections.<ConceptEditorComponent>singletonList(new MandatoryCardinality_Component());
            case "UMLClassDiagramLanguage.editor.SecondCardinality_Component":
              return Collections.<ConceptEditorComponent>singletonList(new SecondCardinality_Component());
            case "UMLClassDiagramLanguage.editor.SecondClassAssociation_Component":
              return Collections.<ConceptEditorComponent>singletonList(new SecondClassAssociation_Component());
            default:
              return Collections.<ConceptEditorComponent>emptyList();
          }
        }
        break;
      case 1:
        if (true) {
          if ("UMLClassDiagramLanguage.editor.BaseClassInheritance_Component".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new BaseClassInheritance_Component());
          }
        }
        break;
      case 2:
        if (true) {
          if ("UMLClassDiagramLanguage.editor.MultiParameter_Component".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new MultiParameter_Component());
          }
        }
        break;
      case 3:
        if (true) {
          if ("UMLClassDiagramLanguage.editor.ParameterType_Component".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ParameterType_Component());
          }
        }
        break;
      case 4:
        if (true) {
          if ("UMLClassDiagramLanguage.editor.ReturnType_Component".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ReturnType_Component());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex2.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new ClassReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new TypeReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69806dd6L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145e9L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69a68bd9L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145a0L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699bebd8L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699f52ffL), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699da096L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69806dd5L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69806dd4L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145a1L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69bbf168L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69814655L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145e8L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69814569L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69814657L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69aaf376L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69aaf379L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145e9L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69806dd4L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69bbf168L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa698145e8L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69814569L)).seal();
  private static final ConceptSwitchIndex conceptIndex2 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699da096L), MetaIdFactory.conceptId(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69aaf379L)).seal();
}