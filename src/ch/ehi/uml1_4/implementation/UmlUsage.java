/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */


    // -beg- preserve=no 3C68EC6E02C0 package "UmlUsage"
package ch.ehi.uml1_4.implementation;
    // -end- 3C68EC6E02C0 package "UmlUsage"

    // -beg- preserve=no 3C68EC6E02C0 autoimport "UmlUsage"
    import ch.ehi.uml1_4.foundation.core.Usage;
    import ch.ehi.uml1_4.implementation.AbstractDependency;
    import ch.ehi.basics.tools.AbstractVisitor;
    import ch.ehi.uml1_4.foundation.core.ModelElement;
    import ch.ehi.uml1_4.foundation.core.PresentationElement;
    import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
    import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
    import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
    import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
    import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
    import ch.ehi.uml1_4.foundation.core.Namespace;
    import ch.ehi.uml1_4.foundation.core.ElementOwnership;
    import ch.ehi.uml1_4.foundation.core.Dependency;
    import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
    import ch.ehi.uml1_4.foundation.core.Constraint;
    import ch.ehi.uml1_4.foundation.core.Component;
    import ch.ehi.uml1_4.foundation.core.ElementResidence;
    import ch.ehi.uml1_4.foundation.core.TemplateParameter;
    import ch.ehi.uml1_4.foundation.core.Flow;
    import ch.ehi.uml1_4.foundation.core.Comment;
    import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
    import ch.ehi.uml1_4.modelmanagement.Package;
    import ch.ehi.uml1_4.modelmanagement.ElementImport;
    import ch.ehi.basics.types.NlsString;
    // -end- 3C68EC6E02C0 autoimport "UmlUsage"

    // import declarations
    // please fill in/modify the following section
    // -beg- preserve=no 3C68EC6E02C0 import "UmlUsage"

    // -end- 3C68EC6E02C0 import "UmlUsage"

    /** @author Claude Eisenhut
     *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:16 $
     */
public class UmlUsage extends AbstractDependency implements Usage , java.io.Serializable
    {
      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 3C68EC6E02C0 detail_begin "UmlUsage"

      // -end- 3C68EC6E02C0 detail_begin "UmlUsage"

      // -beg- preserve=no 3D4FA218003A head3C68EC6E02C0 "unlinkAll"
      public void unlinkAll()
      // -end- 3D4FA218003A head3C68EC6E02C0 "unlinkAll"
        // declare any checked exceptions
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA218003A throws3C68EC6E02C0 "unlinkAll"

        // -end- 3D4FA218003A throws3C68EC6E02C0 "unlinkAll"
        {
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA218003A body3C68EC6E02C0 "unlinkAll"
        
        clearClient();
        clearSupplier();
        clearPresentation();
        clearBehavior();
        clearPartition();
        clearCollaboration();
        clearClassifierRole();
        clearCollaborationInstanceSet();
        detachNamespace();
        clearClientDependency();
        clearTaggedValue();
        clearConstraint();
        clearSupplierDependency();
        clearContainer();
        clearTemplateParameter();
        clearTargetFlow();
        clearSourceFlow();
        clearDefaultParameter();
        clearComment();
        // Role TemplateArgument: TemplateArgument object(s) may point to this
        // Role ParameterDefinition: TemplateParameter object(s) may point to this
        clearStereotype();
        clearReferenceTag();
        clearImportedBy();
        // Role EditorTreeElement: EditorTreeElement object(s) may point to this
        setName(null);
        setDocumentation(null);
        super.unlinkAll();
        // -end- 3D4FA218003A body3C68EC6E02C0 "unlinkAll"
        }

      // -beg- preserve=no 3D4FA2180044 head3C68EC6E02C0 "enumerateChildren"
      public void enumerateChildren(AbstractVisitor visitor)
      // -end- 3D4FA2180044 head3C68EC6E02C0 "enumerateChildren"
        // declare any checked exceptions
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180044 throws3C68EC6E02C0 "enumerateChildren"

        // -end- 3D4FA2180044 throws3C68EC6E02C0 "enumerateChildren"
        {
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180044 body3C68EC6E02C0 "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
        it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
        it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
        visitor.visit(getName());
        visitor.visit(getDocumentation());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2180044 body3C68EC6E02C0 "enumerateChildren"
        }

      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 3C68EC6E02C0 detail_end "UmlUsage"

      // -end- 3C68EC6E02C0 detail_end "UmlUsage"

    }

