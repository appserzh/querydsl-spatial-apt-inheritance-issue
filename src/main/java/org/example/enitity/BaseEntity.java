package org.example.enitity;

import org.locationtech.jts.geom.Geometry;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    protected Geometry baseGeometry;
}
