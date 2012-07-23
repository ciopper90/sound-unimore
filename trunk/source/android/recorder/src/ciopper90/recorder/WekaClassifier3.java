package ciopper90.recorder;

public class WekaClassifier3 {

	public static int classify(Object[] i)
			throws Exception {

		double p = Double.NaN;
		//String [] elemento={"parco","lezione","treno","tv","auto","ristorante","strada"};
		p = WekaClassifier3.N47454090(i);
		return (int) p;
	}
	static double N47454090(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 5;
		} else if (((Double) i[0]).doubleValue() <= 543.0) {
			p = WekaClassifier3.N71391d271(i);
		} else if (((Double) i[0]).doubleValue() > 543.0) {
			p = WekaClassifier3.N62e245b616(i);
		} 
		return p;
	}
	static double N71391d271(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.130496) {
			p = WekaClassifier3.N5ca925832(i);
		} else if (((Double) i[1]).doubleValue() > 0.130496) {
			p = WekaClassifier3.N5371444d9(i);
		} 
		return p;
	}
	static double N5ca925832(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.060993) {
			p = WekaClassifier3.N64ddeafb3(i);
		} else if (((Double) i[1]).doubleValue() > 0.060993) {
			p = WekaClassifier3.N23268b0c7(i);
		} 
		return p;
	}
	static double N64ddeafb3(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.041135) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() > 0.041135) {
			p = WekaClassifier3.N256e38794(i);
		} 
		return p;
	}
	static double N256e38794(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() <= 517.0) {
			p = WekaClassifier3.N673da3215(i);
		} else if (((Double) i[0]).doubleValue() > 517.0) {
			p = 4;
		} 
		return p;
	}
	static double N673da3215(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.049645) {
			p = WekaClassifier3.N7fa1007a6(i);
		} else if (((Double) i[1]).doubleValue() > 0.049645) {
			p = 2;
		} 
		return p;
	}
	static double N7fa1007a6(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 499.0) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() > 499.0) {
			p = 4;
		} 
		return p;
	}
	static double N23268b0c7(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 531.0) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() > 531.0) {
			p = WekaClassifier3.N3772d2db8(i);
		} 
		return p;
	}
	static double N3772d2db8(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.075177) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() > 0.075177) {
			p = 2;
		} 
		return p;
	}
	static double N5371444d9(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 5;
		} else if (((Double) i[0]).doubleValue() <= 509.0) {
			p = 5;
		} else if (((Double) i[0]).doubleValue() > 509.0) {
			p = WekaClassifier3.N313b460710(i);
		} 
		return p;
	}
	static double N313b460710(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 0.319149) {
			p = WekaClassifier3.N2a728ed111(i);
		} else if (((Double) i[1]).doubleValue() > 0.319149) {
			p = WekaClassifier3.N3cba2d0715(i);
		} 
		return p;
	}
	static double N2a728ed111(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 0.168794) {
			p = WekaClassifier3.N46fe511c12(i);
		} else if (((Double) i[1]).doubleValue() > 0.168794) {
			p = 6;
		} 
		return p;
	}
	static double N46fe511c12(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 531.0) {
			p = WekaClassifier3.N627f29ad13(i);
		} else if (((Double) i[0]).doubleValue() > 531.0) {
			p = WekaClassifier3.Na894f6014(i);
		} 
		return p;
	}
	static double N627f29ad13(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 0.156028) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() > 0.156028) {
			p = 6;
		} 
		return p;
	}
	static double Na894f6014(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 535.0) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 535.0) {
			p = 1;
		} 
		return p;
	}
	static double N3cba2d0715(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 511.0) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() > 511.0) {
			p = 3;
		} 
		return p;
	}
	static double N62e245b616(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 653.0) {
			p = WekaClassifier3.N754ee27117(i);
		} else if (((Double) i[0]).doubleValue() > 653.0) {
			p = WekaClassifier3.N662ae1c926(i);
		} 
		return p;
	}
	static double N754ee27117(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.10922) {
			p = WekaClassifier3.Ndf4a4e218(i);
		} else if (((Double) i[1]).doubleValue() > 0.10922) {
			p = WekaClassifier3.N100e3d0f22(i);
		} 
		return p;
	}
	static double Ndf4a4e218(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 0.079433) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() > 0.079433) {
			p = WekaClassifier3.N3874f89619(i);
		} 
		return p;
	}
	static double N3874f89619(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() <= 568.0) {
			p = WekaClassifier3.N76c5ccf20(i);
		} else if (((Double) i[0]).doubleValue() > 568.0) {
			p = 3;
		} 
		return p;
	}
	static double N76c5ccf20(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 545.0) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() > 545.0) {
			p = WekaClassifier3.N5b411dd721(i);
		} 
		return p;
	}
	static double N5b411dd721(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 0.083688) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 0.083688) {
			p = 4;
		} 
		return p;
	}
	static double N100e3d0f22(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 0.348936) {
			p = WekaClassifier3.N16caac0523(i);
		} else if (((Double) i[1]).doubleValue() > 0.348936) {
			p = WekaClassifier3.N7ef28d8b25(i);
		} 
		return p;
	}
	static double N16caac0523(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 0.144681) {
			p = WekaClassifier3.N53e387f324(i);
		} else if (((Double) i[1]).doubleValue() > 0.144681) {
			p = 1;
		} 
		return p;
	}
	static double N53e387f324(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 618.0) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 618.0) {
			p = 1;
		} 
		return p;
	}
	static double N7ef28d8b25(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 638.0) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 638.0) {
			p = 0;
		} 
		return p;
	}
	static double N662ae1c926(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= 695.0) {
			p = WekaClassifier3.N94d878627(i);
		} else if (((Double) i[0]).doubleValue() > 695.0) {
			p = 0;
		} 
		return p;
	}
	static double N94d878627(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 0.163121) {
			p = WekaClassifier3.N40fc732f28(i);
		} else if (((Double) i[1]).doubleValue() > 0.163121) {
			p = WekaClassifier3.N39dee97035(i);
		} 
		return p;
	}
	static double N40fc732f28(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 682.0) {
			p = WekaClassifier3.N7dee33fd29(i);
		} else if (((Double) i[0]).doubleValue() > 682.0) {
			p = WekaClassifier3.N5b14cde831(i);
		} 
		return p;
	}
	static double N7dee33fd29(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 0.107801) {
			p = WekaClassifier3.N219767a230(i);
		} else if (((Double) i[1]).doubleValue() > 0.107801) {
			p = 1;
		} 
		return p;
	}
	static double N219767a230(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 679.0) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 679.0) {
			p = 1;
		} 
		return p;
	}
	static double N5b14cde831(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 0.08227) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 0.08227) {
			p = WekaClassifier3.N32da690f32(i);
		} 
		return p;
	}
	static double N32da690f32(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 0.110638) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 0.110638) {
			p = WekaClassifier3.N212771de33(i);
		} 
		return p;
	}
	static double N212771de33(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 689.0) {
			p = WekaClassifier3.N24a4b6d334(i);
		} else if (((Double) i[0]).doubleValue() > 689.0) {
			p = 0;
		} 
		return p;
	}
	static double N24a4b6d334(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 0.147518) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 0.147518) {
			p = 0;
		} 
		return p;
	}
	static double N39dee97035(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 0;
		} else if (((Double) i[1]).doubleValue() <= 0.243972) {
			p = WekaClassifier3.N59afd5be36(i);
		} else if (((Double) i[1]).doubleValue() > 0.243972) {
			p = 0;
		} 
		return p;
	}
	static double N59afd5be36(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 667.0) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() > 667.0) {
			p = 0;
		} 
		return p;
	}
}
