package org.protege.oboeditor.frames;

import org.protege.editor.owl.OWLEditorKit;
import org.protege.editor.owl.ui.frame.AbstractOWLFrame;
import org.protege.oboeditor.util.OBOVocabulary;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;

/**
 * @author Simon Jupp
 * @date 14/03/2014
 * Functional Genomics Group EMBL-EBI
 */
public class OBOAnnotationFrame extends AbstractOWLFrame<OWLAnnotationSubject> {


    public OBOAnnotationFrame(OWLEditorKit man) {
        super(man.getModelManager().getOWLOntologyManager());
        addSection(new OBOAnnotationFrameSection(man, this, "Definition",
                man.getModelManager().getOWLDataFactory().getOWLAnnotationProperty(OBOVocabulary.DEFINITION.getIRI())));
        addSection(new OBOAnnotationFrameSection(man, this, "Exact synonym",
                man.getModelManager().getOWLDataFactory().getOWLAnnotationProperty(OBOVocabulary.HAS_EXACT_SYNONYM.getIRI())));
        addSection(new OBOAnnotationFrameSection(man, this, "Related synonym",
                man.getModelManager().getOWLDataFactory().getOWLAnnotationProperty(OBOVocabulary.HAS_RELATED_SYNONYM.getIRI())));
        addSection(new OBOAnnotationFrameSection(man, this, "Broad synonym",
                man.getModelManager().getOWLDataFactory().getOWLAnnotationProperty(OBOVocabulary.HAS_BROAD_SYNONYM.getIRI())));
        addSection(new OBOAnnotationFrameSection(man, this, "Narrow synonym",
                man.getModelManager().getOWLDataFactory().getOWLAnnotationProperty(OBOVocabulary.HAS_NARROW_SYNONYM.getIRI())));

        refill();
    }
}
