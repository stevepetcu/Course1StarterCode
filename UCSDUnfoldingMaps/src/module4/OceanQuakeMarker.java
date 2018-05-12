package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}

	@Override
	protected void drawShape(float x, float y, float sideSize, PGraphics pg) {
		pg.ellipse(x, y, sideSize, sideSize);
	}

	// Get the country the earthquake is in
	public String getCountry() {
		return "Ocean";
	}
}
