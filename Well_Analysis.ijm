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
	Stack.setPosition(3, 1, 1);//call this first for consitencey
	run("Reduce Dimensionality...", "slices keep"); //just use frame 1 to get the wells?
	rename("Wells");
	normalised_variance("Wells"); // remove z domain via autofocus
	run("Duplicate...", "use");
	
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

function normalised_variance(image) {

// Choose the most infocus slice

	Stack.getDimensions(width, height, channels, slices, frames);
	run("Clear Results");
	run("Set Measurements...", "  mean redirect=None decimal=5");
	run("Measure");
	mean = getResult("Mean");
	selectWindow("Results");
	run("Close");
	W = getWidth();
	H = getHeight();
	b = 0;
	m = 0;
	normVar = 0; // Set to 0 which is out of focus
	for (l=1; l<=slices; l++){ 
		selectWindow(image);
		Stack.setSlice(l);

		getRawStatistics(nPixels, mean);
		W = getWidth();
		H = getHeight();
		b = 0;

		for (j=0; j<H; j++) {
   			for (i=0; i<W; i++) {
      			p = getPixel(i,j);
      			t = (p-mean)*(p-mean);
      			b += t;
      		}
   		}

		if ((b/(H*W*mean))>normVar) {normVar = (b/(H*W*mean)); m++;} else {normVar=normVar;}

	}
	Stack.setSlice(m);
}

