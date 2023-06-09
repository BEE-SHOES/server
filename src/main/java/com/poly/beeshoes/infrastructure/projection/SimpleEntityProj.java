package com.poly.beeshoes.infrastructure.projection;

import com.poly.beeshoes.entity.base.IsIdentified;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author thangncph26123
 */

@Projection(types = {})
public interface SimpleEntityProj extends IsIdentified {
    String getName();
}
