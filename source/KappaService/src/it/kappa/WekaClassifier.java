package it.kappa;

public class WekaClassifier {

	public static int classify(Object[] i)
			throws Exception {

		double p = Double.NaN;
		p = WekaClassifier.N452d56cc0(i);
		return (int)p;
	}
	
	static double N452d56cc0(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 4;
		} else if (((Double) i[2]).doubleValue() <= 0.09574468085106383) {
			p = WekaClassifier.N239d8e8f1(i);
		} else if (((Double) i[2]).doubleValue() > 0.09574468085106383) {
			p = WekaClassifier.N2f80e05024(i);
		} 
		return p;
	}
	static double N239d8e8f1(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 607.0) {
			p = WekaClassifier.N3cfa608d2(i);
		} else if (((Double) i[1]).doubleValue() > 607.0) {
			p = 0;
		} 
		return p;
	}
	static double N3cfa608d2(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() <= 29.77595461632603) {
			p = WekaClassifier.N59d8e8413(i);
		} else if (((Double) i[0]).doubleValue() > 29.77595461632603) {
			p = WekaClassifier.N77398a7f16(i);
		} 
		return p;
	}
	static double N59d8e8413(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 4;
		} else if (((Double) i[2]).doubleValue() <= 0.06099290780141844) {
			p = WekaClassifier.N2f78317c4(i);
		} else if (((Double) i[2]).doubleValue() > 0.06099290780141844) {
			p = WekaClassifier.N2bbb63e514(i);
		} 
		return p;
	}
	static double N2f78317c4(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 490.0) {
			p = WekaClassifier.N7bf8dc3c5(i);
		} else if (((Double) i[1]).doubleValue() > 490.0) {
			p = WekaClassifier.N1a843a9d11(i);
		} 
		return p;
	}
	static double N7bf8dc3c5(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 2;
		} else if (((Double) i[3]).doubleValue() <= 9.022242555144164) {
			p = WekaClassifier.Nf4326ba6(i);
		} else if (((Double) i[3]).doubleValue() > 9.022242555144164) {
			p = WekaClassifier.N1a3852a7(i);
		} 
		return p;
	}
	static double Nf4326ba6(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() <= 0.029787234042553193) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() > 0.029787234042553193) {
			p = 4;
		} 
		return p;
	}
	static double N1a3852a7(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 4;
		} else if (((Double) i[2]).doubleValue() <= 0.0425531914893617) {
			p = 4;
		} else if (((Double) i[2]).doubleValue() > 0.0425531914893617) {
			p = WekaClassifier.N167b893d8(i);
		} 
		return p;
	}
	static double N167b893d8(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() <= 9.254331787687127) {
			p = WekaClassifier.N86f0f539(i);
		} else if (((Double) i[3]).doubleValue() > 9.254331787687127) {
			p = 2;
		} 
		return p;
	}
	static double N86f0f539(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 483.0) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() > 483.0) {
			p = WekaClassifier.N3357167810(i);
		} 
		return p;
	}
	static double N3357167810(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 488.0) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() > 488.0) {
			p = 4;
		} 
		return p;
	}
	static double N1a843a9d11(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() <= 23.362194626309368) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() > 23.362194626309368) {
			p = WekaClassifier.N5f24270412(i);
		} 
		return p;
	}
	static double N5f24270412(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() <= 9.190849677754974) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() > 9.190849677754974) {
			p = WekaClassifier.N3e7da86813(i);
		} 
		return p;
	}
	static double N3e7da86813(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() <= 9.379905298343841) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() > 9.379905298343841) {
			p = 2;
		} 
		return p;
	}
	static double N2bbb63e514(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 532.0) {
			p = WekaClassifier.N1b9b65d115(i);
		} else if (((Double) i[1]).doubleValue() > 532.0) {
			p = 4;
		} 
		return p;
	}
	static double N1b9b65d115(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 29.487698405251837) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() > 29.487698405251837) {
			p = 4;
		} 
		return p;
	}
	static double N77398a7f16(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 50.271713744538275) {
			p = WekaClassifier.N62b3d4ff17(i);
		} else if (((Double) i[0]).doubleValue() > 50.271713744538275) {
			p = WekaClassifier.N61f951fe22(i);
		} 
		return p;
	}
	static double N62b3d4ff17(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() <= 8.969498800470356) {
			p = WekaClassifier.Nc64e3f918(i);
		} else if (((Double) i[3]).doubleValue() > 8.969498800470356) {
			p = WekaClassifier.N33b2f6ca19(i);
		} 
		return p;
	}
	static double Nc64e3f918(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 523.0) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() > 523.0) {
			p = 4;
		} 
		return p;
	}
	static double N33b2f6ca19(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() <= 0.06382978723404255) {
			p = WekaClassifier.N2a68624a20(i);
		} else if (((Double) i[2]).doubleValue() > 0.06382978723404255) {
			p = 2;
		} 
		return p;
	}
	static double N2a68624a20(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 4;
		} else if (((Double) i[3]).doubleValue() <= 9.218898525288052) {
			p = WekaClassifier.N2b0cfe0621(i);
		} else if (((Double) i[3]).doubleValue() > 9.218898525288052) {
			p = 2;
		} 
		return p;
	}
	static double N2b0cfe0621(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 2;
		} else if (((Double) i[3]).doubleValue() <= 9.107134003983829) {
			p = 2;
		} else if (((Double) i[3]).doubleValue() > 9.107134003983829) {
			p = 4;
		} 
		return p;
	}
	static double N61f951fe22(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 517.0) {
			p = WekaClassifier.N37762cf223(i);
		} else if (((Double) i[1]).doubleValue() > 517.0) {
			p = 1;
		} 
		return p;
	}
	static double N37762cf223(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() <= 0.08794326241134752) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() > 0.08794326241134752) {
			p = 2;
		} 
		return p;
	}
	static double N2f80e05024(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 9.369628543027758) {
			p = WekaClassifier.N3606bc8d25(i);
		} else if (((Double) i[3]).doubleValue() > 9.369628543027758) {
			p = WekaClassifier.Nba8641a84(i);
		} 
		return p;
	}
	static double N3606bc8d25(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 537.0) {
			p = WekaClassifier.N7444e8b026(i);
		} else if (((Double) i[1]).doubleValue() > 537.0) {
			p = WekaClassifier.N29749e2e64(i);
		} 
		return p;
	}
	static double N7444e8b026(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 74.97613461106491) {
			p = WekaClassifier.N5808b67227(i);
		} else if (((Double) i[0]).doubleValue() > 74.97613461106491) {
			p = WekaClassifier.N67fa1acd30(i);
		} 
		return p;
	}
	static double N5808b67227(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 8.762648374996402) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() > 8.762648374996402) {
			p = WekaClassifier.N2402238528(i);
		} 
		return p;
	}
	static double N2402238528(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 69.8441640194841) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() > 69.8441640194841) {
			p = WekaClassifier.N86a033b29(i);
		} 
		return p;
	}
	static double N86a033b29(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 74.64542944516704) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 74.64542944516704) {
			p = 2;
		} 
		return p;
	}
	static double N67fa1acd30(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 499.0) {
			p = WekaClassifier.N54f5be0f31(i);
		} else if (((Double) i[1]).doubleValue() > 499.0) {
			p = WekaClassifier.N59c9c97636(i);
		} 
		return p;
	}
	static double N54f5be0f31(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 5;
		} else if (((Double) i[1]).doubleValue() <= 472.0) {
			p = WekaClassifier.N5190f65c32(i);
		} else if (((Double) i[1]).doubleValue() > 472.0) {
			p = WekaClassifier.N41e3bda33(i);
		} 
		return p;
	}
	static double N5190f65c32(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 5;
		} else if (((Double) i[3]).doubleValue() <= 9.103780063591492) {
			p = 5;
		} else if (((Double) i[3]).doubleValue() > 9.103780063591492) {
			p = 3;
		} 
		return p;
	}
	static double N41e3bda33(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 493.0) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 493.0) {
			p = WekaClassifier.N5ceb675234(i);
		} 
		return p;
	}
	static double N5ceb675234(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 156.67511638930685) {
			p = WekaClassifier.N62cc682635(i);
		} else if (((Double) i[0]).doubleValue() > 156.67511638930685) {
			p = 3;
		} 
		return p;
	}
	static double N62cc682635(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 8.897684345884409) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() > 8.897684345884409) {
			p = 6;
		} 
		return p;
	}
	static double N59c9c97636(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 9.26996235507528) {
			p = WekaClassifier.N4ec9900737(i);
		} else if (((Double) i[3]).doubleValue() > 9.26996235507528) {
			p = WekaClassifier.N36649bf54(i);
		} 
		return p;
	}
	static double N4ec9900737(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 190.33255455395198) {
			p = WekaClassifier.N130ee3fa38(i);
		} else if (((Double) i[0]).doubleValue() > 190.33255455395198) {
			p = 3;
		} 
		return p;
	}
	static double N130ee3fa38(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() <= 0.13900709219858157) {
			p = WekaClassifier.N36993bdc39(i);
		} else if (((Double) i[2]).doubleValue() > 0.13900709219858157) {
			p = WekaClassifier.N629048540(i);
		} 
		return p;
	}
	static double N36993bdc39(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() <= 0.12198581560283688) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() > 0.12198581560283688) {
			p = 1;
		} 
		return p;
	}
	static double N629048540(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 521.0) {
			p = WekaClassifier.N6ee7baeb41(i);
		} else if (((Double) i[1]).doubleValue() > 521.0) {
			p = WekaClassifier.N4b02bddc48(i);
		} 
		return p;
	}
	static double N6ee7baeb41(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 8.847334691223443) {
			p = WekaClassifier.N2fa0d32f42(i);
		} else if (((Double) i[3]).doubleValue() > 8.847334691223443) {
			p = WekaClassifier.N45cd467444(i);
		} 
		return p;
	}
	static double N2fa0d32f42(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 514.0) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 514.0) {
			p = WekaClassifier.N6788cb1643(i);
		} 
		return p;
	}
	static double N6788cb1643(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 8.37770152771181) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() > 8.37770152771181) {
			p = 6;
		} 
		return p;
	}
	static double N45cd467444(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 102.25948621484794) {
			p = WekaClassifier.N27cc8d7945(i);
		} else if (((Double) i[0]).doubleValue() > 102.25948621484794) {
			p = 6;
		} 
		return p;
	}
	static double N27cc8d7945(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 6;
		} else if (((Double) i[2]).doubleValue() <= 0.19290780141843972) {
			p = WekaClassifier.N665c175846(i);
		} else if (((Double) i[2]).doubleValue() > 0.19290780141843972) {
			p = 2;
		} 
		return p;
	}
	static double N665c175846(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 514.0) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() > 514.0) {
			p = WekaClassifier.N2800c6e847(i);
		} 
		return p;
	}
	static double N2800c6e847(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 517.0) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 517.0) {
			p = 6;
		} 
		return p;
	}
	static double N4b02bddc48(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 9.150438011094446) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() > 9.150438011094446) {
			p = WekaClassifier.N20fedcfd49(i);
		} 
		return p;
	}
	static double N20fedcfd49(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 524.0) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() > 524.0) {
			p = WekaClassifier.N3c5e76f750(i);
		} 
		return p;
	}
	static double N3c5e76f750(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 136.54006028741327) {
			p = WekaClassifier.N5dd4711751(i);
		} else if (((Double) i[0]).doubleValue() > 136.54006028741327) {
			p = 3;
		} 
		return p;
	}
	static double N5dd4711751(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 534.0) {
			p = WekaClassifier.N264ccd2152(i);
		} else if (((Double) i[1]).doubleValue() > 534.0) {
			p = 1;
		} 
		return p;
	}
	static double N264ccd2152(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() <= 0.16595744680851063) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() > 0.16595744680851063) {
			p = WekaClassifier.N7c2f452b53(i);
		} 
		return p;
	}
	static double N7c2f452b53(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 528.0) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 528.0) {
			p = 6;
		} 
		return p;
	}
	static double N36649bf54(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 518.0) {
			p = WekaClassifier.N30739c5755(i);
		} else if (((Double) i[1]).doubleValue() > 518.0) {
			p = WekaClassifier.N755b6f0a57(i);
		} 
		return p;
	}
	static double N30739c5755(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 9.353678028846433) {
			p = WekaClassifier.N761d2c9a56(i);
		} else if (((Double) i[3]).doubleValue() > 9.353678028846433) {
			p = 1;
		} 
		return p;
	}
	static double N761d2c9a56(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() <= 0.14609929078014183) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() > 0.14609929078014183) {
			p = 6;
		} 
		return p;
	}
	static double N755b6f0a57(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 177.16927412200388) {
			p = WekaClassifier.N45d735b758(i);
		} else if (((Double) i[0]).doubleValue() > 177.16927412200388) {
			p = WekaClassifier.N1c3eb15262(i);
		} 
		return p;
	}
	static double N45d735b758(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 9.308983312528236) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() > 9.308983312528236) {
			p = WekaClassifier.N3407a53359(i);
		} 
		return p;
	}
	static double N3407a53359(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 9.31642318841169) {
			p = WekaClassifier.N61eed1f460(i);
		} else if (((Double) i[3]).doubleValue() > 9.31642318841169) {
			p = WekaClassifier.N61a1c6761(i);
		} 
		return p;
	}
	static double N61eed1f460(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() <= 135.17804424159573) {
			p = 3;
		} else if (((Double) i[0]).doubleValue() > 135.17804424159573) {
			p = 6;
		} 
		return p;
	}
	static double N61a1c6761(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 524.0) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 524.0) {
			p = 6;
		} 
		return p;
	}
	static double N1c3eb15262(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 533.0) {
			p = WekaClassifier.N57eb8cfa63(i);
		} else if (((Double) i[1]).doubleValue() > 533.0) {
			p = 3;
		} 
		return p;
	}
	static double N57eb8cfa63(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() <= 524.0) {
			p = 3;
		} else if (((Double) i[1]).doubleValue() > 524.0) {
			p = 1;
		} 
		return p;
	}
	static double N29749e2e64(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 7.99020166992274) {
			p = WekaClassifier.N273cf34565(i);
		} else if (((Double) i[3]).doubleValue() > 7.99020166992274) {
			p = WekaClassifier.N7055f05567(i);
		} 
		return p;
	}
	static double N273cf34565(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 108.6331399403662) {
			p = WekaClassifier.N12874b2366(i);
		} else if (((Double) i[0]).doubleValue() > 108.6331399403662) {
			p = 0;
		} 
		return p;
	}
	static double N12874b2366(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 680.0) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() > 680.0) {
			p = 0;
		} 
		return p;
	}
	static double N7055f05567(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 574.0) {
			p = WekaClassifier.N1a15961168(i);
		} else if (((Double) i[1]).doubleValue() > 574.0) {
			p = WekaClassifier.N511be52978(i);
		} 
		return p;
	}
	static double N1a15961168(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 8.909050684137382) {
			p = WekaClassifier.N7f2f437769(i);
		} else if (((Double) i[3]).doubleValue() > 8.909050684137382) {
			p = WekaClassifier.N56fc3f0b71(i);
		} 
		return p;
	}
	static double N7f2f437769(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 159.79627711987143) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() > 159.79627711987143) {
			p = WekaClassifier.N77f67adc70(i);
		} 
		return p;
	}
	static double N77f67adc70(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() <= 211.28576076321153) {
			p = 6;
		} else if (((Double) i[0]).doubleValue() > 211.28576076321153) {
			p = 3;
		} 
		return p;
	}
	static double N56fc3f0b71(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() <= 0.2652482269503546) {
			p = WekaClassifier.N4a8f17ca72(i);
		} else if (((Double) i[2]).doubleValue() > 0.2652482269503546) {
			p = 3;
		} 
		return p;
	}
	static double N4a8f17ca72(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 81.28200959558222) {
			p = WekaClassifier.N7862f50373(i);
		} else if (((Double) i[0]).doubleValue() > 81.28200959558222) {
			p = WekaClassifier.N289bab5976(i);
		} 
		return p;
	}
	static double N7862f50373(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 4;
		} else if (((Double) i[0]).doubleValue() <= 55.065266085309815) {
			p = WekaClassifier.N28c3d5b474(i);
		} else if (((Double) i[0]).doubleValue() > 55.065266085309815) {
			p = WekaClassifier.N5103315475(i);
		} 
		return p;
	}
	static double N28c3d5b474(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() <= 548.0) {
			p = 4;
		} else if (((Double) i[1]).doubleValue() > 548.0) {
			p = 2;
		} 
		return p;
	}
	static double N5103315475(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() <= 0.18581560283687942) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() > 0.18581560283687942) {
			p = 2;
		} 
		return p;
	}
	static double N289bab5976(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 9.041134961412228) {
			p = WekaClassifier.N40e74e377(i);
		} else if (((Double) i[3]).doubleValue() > 9.041134961412228) {
			p = 1;
		} 
		return p;
	}
	static double N40e74e377(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() <= 554.0) {
			p = 6;
		} else if (((Double) i[1]).doubleValue() > 554.0) {
			p = 1;
		} 
		return p;
	}
	static double N511be52978(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 9.039922545848718) {
			p = WekaClassifier.N7e62105879(i);
		} else if (((Double) i[3]).doubleValue() > 9.039922545848718) {
			p = WekaClassifier.Nd0a008683(i);
		} 
		return p;
	}
	static double N7e62105879(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 196.57945103283149) {
			p = WekaClassifier.N581f423a80(i);
		} else if (((Double) i[0]).doubleValue() > 196.57945103283149) {
			p = WekaClassifier.N1281e1b882(i);
		} 
		return p;
	}
	static double N581f423a80(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 602.0) {
			p = WekaClassifier.N6c351b0881(i);
		} else if (((Double) i[1]).doubleValue() > 602.0) {
			p = 1;
		} 
		return p;
	}
	static double N6c351b0881(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() <= 8.568509337491985) {
			p = 6;
		} else if (((Double) i[3]).doubleValue() > 8.568509337491985) {
			p = 1;
		} 
		return p;
	}
	static double N1281e1b882(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 614.0) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 614.0) {
			p = 3;
		} 
		return p;
	}
	static double Nd0a008683(Object []i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() <= 0.16595744680851063) {
			p = 3;
		} else if (((Double) i[2]).doubleValue() > 0.16595744680851063) {
			p = 1;
		} 
		return p;
	}
	static double Nba8641a84(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 68.16965618935318) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() > 68.16965618935318) {
			p = WekaClassifier.N5c43ecf085(i);
		} 
		return p;
	}
	static double N5c43ecf085(Object []i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 5;
		} else if (((Double) i[0]).doubleValue() <= 254.96342325111314) {
			p = 5;
		} else if (((Double) i[0]).doubleValue() > 254.96342325111314) {
			p = WekaClassifier.N6f78afe286(i);
		} 
		return p;
	}
	static double N6f78afe286(Object []i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() <= 9.407578738066292) {
			p = 3;
		} else if (((Double) i[3]).doubleValue() > 9.407578738066292) {
			p = WekaClassifier.N5c63579a87(i);
		} 
		return p;
	}
	static double N5c63579a87(Object []i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 5;
		} else if (((Double) i[1]).doubleValue() <= 500.0) {
			p = 5;
		} else if (((Double) i[1]).doubleValue() > 500.0) {
			p = 2;
		} 
		return p;
	}
}
