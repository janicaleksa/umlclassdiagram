package UMLClassDiagramLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SProperty;

public class check_AssociationClass_Name_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_AssociationClass_Name_NonTypesystemRule() {
  }
  public void applyRule(final SNode associationClassConcept, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(associationClassConcept), CONCEPTS.ClassDiagramTemplate$YU), LINKS.relations$bzjk)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, CONCEPTS.AssociationClass$G6) && Objects.equals(SPropertyOperations.getString(it, PROPS.name$tAp1), SPropertyOperations.getString(associationClassConcept, PROPS.name$tAp1)) && !(Objects.equals(associationClassConcept, it));
      }
    })) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(associationClassConcept, "The name of association class: '" + SPropertyOperations.getString(associationClassConcept, PROPS.name$tAp1) + "' already exist!", "r:06cfd457-ea11-443f-b3ac-270ab160bbea(UMLClassDiagramLanguage.typesystem)", "615503414691895321", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.AssociationClass$G6;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept ClassDiagramTemplate$YU = MetaAdapterFactory.getConcept(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699f52ffL, "UMLClassDiagramLanguage.structure.ClassDiagramTemplate");
    /*package*/ static final SConcept AssociationClass$G6 = MetaAdapterFactory.getConcept(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa69a68bd9L, "UMLClassDiagramLanguage.structure.AssociationClass");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink relations$bzjk = MetaAdapterFactory.getContainmentLink(0x9f6af2edaadf44adL, 0xbf237f18f5a9a442L, 0x61a8fafa699f52ffL, 0x61a8fafa69a0cbccL, "relations");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }
}