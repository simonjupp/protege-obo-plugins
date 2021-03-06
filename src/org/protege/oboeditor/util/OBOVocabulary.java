package org.protege.oboeditor.util;

import org.semanticweb.owlapi.model.IRI;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simon Jupp
 * @date 14/03/2014
 * Functional Genomics Group EMBL-EBI
 */
public enum OBOVocabulary {

    XREF("http://www.geneontology.org/formats/oboInOwl#hasDbXref"),
    HAS_BROAD_SYNONYM("http://www.geneontology.org/formats/oboInOwl#hasBroadSynonym"),
    HAS_EXACT_SYNONYM("http://www.geneontology.org/formats/oboInOwl#hasExactSynonym"),
    HAS_RELATED_SYNONYM("http://www.geneontology.org/formats/oboInOwl#hasRelatedSynonym"),
    HAS_NARROW_SYNONYM("http://www.geneontology.org/formats/oboInOwl#hasNarrowSynonym"),
    DEFINITION("http://purl.obolibrary.org/obo/IAO_0000115");

    public static final Set<IRI> ALL_URIS;

    static {
        ALL_URIS = new HashSet<IRI>();
        for(OBOVocabulary v : values()) {
            ALL_URIS.add(v.getIRI());
        }
    }

    private String localName;

    private IRI iri;

    OBOVocabulary(String localname) {
        this.localName = localname;
        this.iri = IRI.create(localname);
    }


    public String getLocalName() {
        return iri.getFragment();
    }


    public IRI getIRI() {
        return iri;
    }
}
