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
	LFArea NCGlC = new LFArea( 1,"New Century Global Center","China", "Chengdu", 1760000 , "L1.jpg");
	LFArea DIAT3 = new LFArea( 2,"DIAT3","United Arib Emirates", "Dubai", 1713000 , "L2.jpg");	
	LFArea AAE = new LFArea( 3,"Abraj Al-Bait Endowment","Saudai Arabia", "Mecca", 1575815 , "L3.jpg");
	LFArea CW = new LFArea( 4,"CentralWorld","Thailand", "Bangkok", 1024000 , "L4.jpg");	
	LFArea AFA = new LFArea( 5,"Aalsmeer Flower","Netherlands", "Aalsmeer", 990000 , "L5.jpg");
	LFArea BCIAT3 = new LFArea( 6,"Beijing Capital International Airport Terminal 3","China", "Beijing", 986000 , "L6.jpg");	
	LFArea TVM = new LFArea( 7,"The Venetian Macao","Macau", "Macau", 980000 , "L7.jpg");
	LFArea SCC = new LFArea( 8,"Sands Cotai Central","Macau", "Macau", 890000 , "L8.jpg");
	LFArea CWS = new LFArea( 9,"Ciputra World Surabaya","Indonesia", "Surabaya", 1760000 , "L9.jpg");
	LFArea BTS = new LFArea( 10,"Berjaya Times Square","Malaysia", "Kuala Lumpur", 1760000 , "L10.jpg");
	
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
	
	return areas;
	}
public ArrayList<LUVolume> getVolume(){
	ArrayList<LUVolume> volume = new ArrayList<LUVolume>();
	//int rank,String name, String country, String place, double floorArea, double volume,String Image
	LUVolume BEF = new LUVolume( 1,"Boeing Everett Factory","United States","Washington", 398000, 13300000 , "V1.jpg");
	LUVolume GMM = new LUVolume( 2,"Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia", 356000, 8000000 , "V2.jpg");	
	LUVolume JLLP = new LUVolume( 3,"Jean-Luc Lagardère Plant","France","Toulouse-Blagnac", 122500, 5600000 ,"V3.jpg");
	LUVolume BCWC = new LUVolume( 4,"Boeing Composite Wing Center","United States","Washington", 111500, 3700000 ,"V4.jpg");	
	LUVolume A = new LUVolume( 5,"Aerium","Germany","Brandenburg", 70000, 5200000 ,"V5.jpg");
	LUVolume MWD2 = new LUVolume( 6,"Meyer Werft Dockhalle 2","Germany","Niedersachsen", 63000, 4720000 ,"V6.jpg");	
	LUVolume NASAVAB = new LUVolume( 7,"NASAVAB","United States","Florida", 32374, 3660000 ,"V7.jpg");
	LUVolume TO2 = new LUVolume( 8,"The O2","United Kingdom","London", 104634, 2790000 ,"V8.jpg");
	LUVolume TIDC = new LUVolume( 9,"Tesco Ireland Distribution Centre","Ireland","Fingal", 80194, 1550000 ,"V9.jpg");
	LUVolume TIW = new LUVolume( 10,"Target Import Warehouse","United States","Georgia", 187664, 1500000 ,"V10.jpg");
	
	volume.add(BEF);
	volume.add(GMM);
	volume.add(JLLP);
	volume.add(BCWC);
	volume.add(A);
	volume.add(MWD2);
	volume.add(NASAVAB);
	volume.add(TO2);
	volume.add(TIDC);
	volume.add(TIW);
	
	return volume;
	}

public ArrayList<LFPrint> getFootPrint(){
	ArrayList<LFPrint> footprint = new ArrayList<LFPrint>();
	//int rank,String name, String country, String place, double footprint, String lengthwidth,String Image
	LFPrint AFA = new LFPrint( 1,"Aalsmeer Flower Auction"                                ,"Netherlands"		 ,"Aalsmeer"  	  	  , 518000, "740m X 740m" , "1F.jpg");
	LFPrint TF = new LFPrint( 2,"Tesla Factory"                                           ,"United States"	     ,"California"	  	  , 427354, "" 			  , "2F.jpg");
	LFPrint BEF = new LFPrint( 3,"Boeing Everett Factory"                                 ,"United States"		 ,"Washington"	  	  , 398000, "900m X 485m" , "3F.jpg");
	LFPrint MDC = new LFPrint( 4,"Michelin Distribution Center"                           ,"United States"		 ,"South Carolina"	  , 371612, "336m X 1097m", "4F.jpg");	
	LFPrint GMM = new LFPrint( 5,"Great Mosque of Mecca"                                  ,"United States"		 ,"Washington"	  	  , 356000, "" 			  , "5F.jpg");
	LFPrint NNALC = new LFPrint( 6,"Nike - North America Logistics Center"                ,"United States"		 ,"Tennessee"	      , 260000, "" 			  , "6F.jpg");	
	LFPrint JDNAPDC = new LFPrint( 7,"John Deere North American Parts Distribution Center","United States"		 ,"Illinois"	      , 246000, "" 			  , "7F.jpg");
	LFPrint MD = new LFPrint( 8,"Mall of Dubai"                                           ,"United Arab Emirates","Dubai"		      , 500000, "" 			  , "8F.jpg");
	LFPrint MMNA = new LFPrint( 9,"	Mitsubishi Motors North America"                      ,"United States"       ,"Illinois"	      , 220000, "920m X 200m" , "9F.jpg");
	LFPrint ICE = new LFPrint( 10,"Indonesia Convention Exhibition"                       ,"Indonesia"           ,"Bumi Serpong Damai", 220000, "" 			  , "10F.jpg");
	
	footprint.add(AFA);
	footprint.add(TF);
	footprint.add(BEF);
	footprint.add(MDC);
	footprint.add(GMM);
	footprint.add(NNALC);
	footprint.add(JDNAPDC);
	footprint.add(MD);
	footprint.add(MMNA);
	footprint.add(ICE);
	
	return footprint;
	}	
}
