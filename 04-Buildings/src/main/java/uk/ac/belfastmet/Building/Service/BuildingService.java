package uk.ac.belfastmet.Building.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.Building.domain.LFArea;
import uk.ac.belfastmet.Building.domain.LFPrint;
import uk.ac.belfastmet.Building.domain.LUVolume;


@Service

public class BuildingService {

	private ArrayList<LFArea> area;
	private ArrayList<LUVolume> volume;
	private ArrayList<LFPrint> footprint;
	
public ArrayList<LFArea> getAreas(){
	ArrayList<LFArea> areas = new ArrayList<LFArea>();
	//int rank,String name, String country, String place, double floorArea,String Image
	LFArea NCGlC = new LFArea( 1,"New Century Global Center","China", "Chengdu", 1760000 , "NCGC.png");
	LFArea DIAT3 = new LFArea( 2,"DIAT3","United Arib Emirates", "Dubai", 1713000 , "DIAT3.png");	
	LFArea AAE = new LFArea( 3,"Abraj Al-Bait Endowment","Saudai Arabia", "Mecca", 1575815 , "AAE.png");
	LFArea CW = new LFArea( 4,"CentralWorld","Thailand", "Bangkok", 1024000 , "CW.png");	
	LFArea AFA = new LFArea( 5,"Aalsmeer Flower","Netherlands", "Aalsmeer", 990000 , "AFA.png");
	LFArea BCIAT3 = new LFArea( 6,"Beijing Capital International Airport Terminal 3","China", "Beijing", 986000 , "BCIAT3.png");	
	LFArea TVM = new LFArea( 7,"The Venetian Macao","Macau", "Macau", 980000 , "TVM.png");
	LFArea SCC = new LFArea( 8,"Sands Cotai Central","Macau", "Macau", 890000 , "SCC.png");
	LFArea CWS = new LFArea( 9,"Ciputra World Surabaya","Indonesia", "Surabaya", 1760000 , "CWS.png");
	LFArea BTS = new LFArea( 10,"Berjaya Times Square","Malaysia", "Kuala Lumpur", 1760000 , "BTS.png");
	
	areas.add(NCGlC);
	areas.add(DIAT3);
	areas.add(AAE);
	areas.add(CW);
	areas.add(AFA);
	areas.add(BCIAT3);
	areas.add(TVM);
	areas.add(SCC);
	areas.add(CWS);
	areas.add(BTS);
	
	for(LFArea areaX: areas) {
		if(areaX.getName().equals("Berjaya Times Square")){
		System.out.print(areaX.getName());
		}
	}

	return areas;

	}
	
}
