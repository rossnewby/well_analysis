// Well Analysis
//
// This is a set of tools for identifying and analysing circular wells in a hyperstack image
//
// Author: Ross Newby

var wellCount = 0; // number of wells detected
var wellRadius;

// Identify (and discard empty) wells
macro "Automatic Well Detection Action Tool - C059 O00gg L55b8 Lb85b L5b55" { // <- number?

	/* Run hough circle transform plugin (wiki: https://imagej.net/Hough_Circle_Transform) (test image = 500 circles approx.) */
	run("Reduce Dimensionality...", "channels slices keep"); // remove t domain
	run("Delete Slice", "delete=channel"); // remove channels (trying to find more condensed way to do this)
	run("Delete Slice", "delete=channel");
	run("Next Slice [>]");
	run("Delete Slice", "delete=channel");
	//run("Z Project...", "projection=[Average Intensity] all"); // remove z domain via z projection
	run("Autofocus Hyperstack"); // remove z domain via autofocus
	run("Find Edges")
	setAutoThreshold("Default dark");
	setThreshold(60, 255); // params work with test hyperstack (!)
	setOption("BlackBackground", true);
	run("Convert to Mask"); // Displays an image after execution (?)
	run("Hough Circle Transform","minRadius=20, maxRadius=50, inc=1, minCircles=1, maxCircles=1000, threshold=0.5, resolution=500, ratio=1.0, bandwidth=10, local_radius=10,  reduce show_mask results_table");
	// *this is taking a long time, parameters may be amended to speed up computation (?)

	// saveAs("Results", "C:\\Users\\Ross\\Documents\\University\\Intern - Cell Analysis\\results.csv");

	// <Further manipulation of results table>
}

// Used to select identified wells 
macro "Well Selection Tool - C059 O00cc L4484 L4448 L44ff" {

	if (wellCount == 0){
		print("No wells have been detected");
	}
		
	// <code>
}
