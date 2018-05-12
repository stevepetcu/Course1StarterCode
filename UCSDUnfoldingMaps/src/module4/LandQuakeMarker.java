package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;
import java.lang.Math;

/** Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {
	public LandQuakeMarker(PointFeature quake) {

		// calling EarthquakeMarker constructor
		super(quake);

		// setting field in earthquake marker
		isOnLand = true;
	}

	@Override
	protected void drawShape(float x, float y, float sideSize, PGraphics pg) {
		pg.rect(x, y, sideSize, sideSize);
	}

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}
}