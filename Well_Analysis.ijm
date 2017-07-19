// Well Analysis
//
// This is a set of tools for identifying and analysing circular wells in a hyperstack image
//
// Author: Ross Newby

var nWells = 0; // number of wells detected
var wellRadius;

// Output all wells to a results table
macro "Automatic Well Detection Action Tool - C059 O00gg L55b8 Lb85b L5b55" {

	/* Run hough circle transform plugin (wiki: https://imagej.net/Hough_Circle_Transform) (test image = 500 circles approx.) */
	run("Reduce Dimensionality...", "channels slices keep"); // remove t domain
	run("Delete Slice", "delete=channel"); // remove channels (trying to find more condensed way to do this)
	run("Delete Slice", "delete=channel");
	run("Next Slice [>]");
	run("Delete Slice", "delete=channel");
	
	//run("Z Project...", "projection=[Average Intensity] all"); // remove z domain via z projection
	//IJ.showStatus("Autofocusing...");
	run("Autofocus_Hyperstack"); // remove z domain via autofocus
	
	run("Find Edges")
	setAutoThreshold("Default dark");
	setThreshold(60, 255); // params work with test hyperstack (!)
	setOption("BlackBackground", true);
	run("Convert to Mask"); // Displays an image after execution (?)
	run("Hough Circle Transform","minRadius=20, maxRadius=50, inc=1, minCircles=1, maxCircles=1000, threshold=0.6, resolution=100, ratio=1.0, bandwidth=10, local_radius=10,  reduce results_table"); // add 'show_mask to display image with circles

	// saveAs("Results", "C:\\Users\\Ross\\Documents\\University\\Intern - Cell Analysis\\results.csv");
	close(); // close un-necessary windows
	close();

	// nWells - nResults;
}

// Delete empty wells from an result table
macro "Convert Action Table to ROISET Action Tool - C059 L58b8 Lb885 Lb88b"{

	for (i = 0; i < nResults; i++)
	{
		xLoc = getResult("X (pixels)", i);
		yLoc = getResult("Y (pixels)", i);
		rad = getResult("Radius (pixels)", i);
		makeOval(xLoc-rad, yLoc-rad, rad*2, rad*2);
		roiManager("Add");
	}
}

// Delete empty wells from an result table
macro "Automatic Discard Well Action Tool - C059 O00gg L55bb L5bb5"{

	// On an ROISET or action table (?) 
}

// Used to select identified wells 
macro "Well Selection Tool - C059 O00cc L4484 L4448 L44ff" {

	if (wellCount == 0){
		print("No wells have been detected");
	}
		
	// <code>
}

function discard_wells(){

	for (i = 0; i < nResults; i++){
		//
	}
}
