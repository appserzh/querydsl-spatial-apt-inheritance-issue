package org.example.enitity;

import org.locationtech.jts.geom.Geometry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleEntity extends BaseEntity{

    private Geometry sampleGeometry;
}
