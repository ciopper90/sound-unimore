package ciopper90.recorder;

public class WekaClassifier1 {

	  public static int classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WekaClassifier1.N78ce9fda0(i);
	    return (int) p;
	  }
	  static double N78ce9fda0(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() <= 0.09574468085106383) {
	    p = WekaClassifier1.N4560df2c1(i);
	    } else if (((Double) i[2]).doubleValue() > 0.09574468085106383) {
	    p = WekaClassifier1.N70a7bd3a34(i);
	    } 
	    return p;
	  }
	  static double N4560df2c1(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 7.290799481191118) {
	    p = WekaClassifier1.N5adbe5492(i);
	    } else if (((Double) i[3]).doubleValue() > 7.290799481191118) {
	    p = WekaClassifier1.N4e48b3eb5(i);
	    } 
	    return p;
	  }
	  static double N5adbe5492(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 4.0941772700771155) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 4.0941772700771155) {
	    p = WekaClassifier1.N1aaa4a393(i);
	    } 
	    return p;
	  }
	  static double N1aaa4a393(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 6.747374400514169) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 6.747374400514169) {
	    p = WekaClassifier1.N21eef1dc4(i);
	    } 
	    return p;
	  }
	  static double N21eef1dc4(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 702.0) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 702.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N4e48b3eb5(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 4;
	    } else if (((Double) i[0]).doubleValue() <= 29.77595461632603) {
	    p = WekaClassifier1.N71c31746(i);
	    } else if (((Double) i[0]).doubleValue() > 29.77595461632603) {
	    p = WekaClassifier1.N1277f39921(i);
	    } 
	    return p;
	  }
	  static double N71c31746(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() <= 626.0) {
	    p = WekaClassifier1.N4bf2ba517(i);
	    } else if (((Double) i[1]).doubleValue() > 626.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N4bf2ba517(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() <= 490.0) {
	    p = WekaClassifier1.N2ca642cb8(i);
	    } else if (((Double) i[1]).doubleValue() > 490.0) {
	    p = WekaClassifier1.N6a69f6ea12(i);
	    } 
	    return p;
	  }
	  static double N2ca642cb8(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() <= 0.0425531914893617) {
	    p = WekaClassifier1.N576b34539(i);
	    } else if (((Double) i[2]).doubleValue() > 0.0425531914893617) {
	    p = WekaClassifier1.N3f3861fb10(i);
	    } 
	    return p;
	  }
	  static double N576b34539(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 8.96836479274725) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 8.96836479274725) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N3f3861fb10(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 4;
	    } else if (((Double) i[3]).doubleValue() <= 9.224196876342674) {
	    p = WekaClassifier1.Nea8c62a11(i);
	    } else if (((Double) i[3]).doubleValue() > 9.224196876342674) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double Nea8c62a11(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 22.89742655125141) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 22.89742655125141) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N6a69f6ea12(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() <= 0.03971631205673759) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() > 0.03971631205673759) {
	    p = WekaClassifier1.N52d1b33a13(i);
	    } 
	    return p;
	  }
	  static double N52d1b33a13(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 4;
	    } else if (((Double) i[0]).doubleValue() <= 20.900350469979717) {
	    p = WekaClassifier1.N454dcf5014(i);
	    } else if (((Double) i[0]).doubleValue() > 20.900350469979717) {
	    p = WekaClassifier1.N7765b0bb15(i);
	    } 
	    return p;
	  }
	  static double N454dcf5014(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() <= 565.0) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() > 565.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7765b0bb15(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 4;
	    } else if (((Double) i[3]).doubleValue() <= 9.191545032358766) {
	    p = WekaClassifier1.N3536023a16(i);
	    } else if (((Double) i[3]).doubleValue() > 9.191545032358766) {
	    p = WekaClassifier1.N57d50bad18(i);
	    } 
	    return p;
	  }
	  static double N3536023a16(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() <= 0.06382978723404255) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() > 0.06382978723404255) {
	    p = WekaClassifier1.N6ccc492017(i);
	    } 
	    return p;
	  }
	  static double N6ccc492017(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 542.0) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 542.0) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N57d50bad18(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 4;
	    } else if (((Double) i[2]).doubleValue() <= 0.059574468085106386) {
	    p = WekaClassifier1.N63f1b7e719(i);
	    } else if (((Double) i[2]).doubleValue() > 0.059574468085106386) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N63f1b7e719(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 518.0) {
	    p = WekaClassifier1.N1260d1f420(i);
	    } else if (((Double) i[1]).doubleValue() > 518.0) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N1260d1f420(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() <= 513.0) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() > 513.0) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N1277f39921(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 531.0) {
	    p = WekaClassifier1.N119cb4822(i);
	    } else if (((Double) i[1]).doubleValue() > 531.0) {
	    p = WekaClassifier1.N772fd3ce28(i);
	    } 
	    return p;
	  }
	  static double N119cb4822(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 2;
	    } else if (((Double) i[2]).doubleValue() <= 0.06382978723404255) {
	    p = WekaClassifier1.N4470e48823(i);
	    } else if (((Double) i[2]).doubleValue() > 0.06382978723404255) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4470e48823(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 36.844760791924315) {
	    p = WekaClassifier1.N4fabbfd224(i);
	    } else if (((Double) i[0]).doubleValue() > 36.844760791924315) {
	    p = WekaClassifier1.N6e2bf88026(i);
	    } 
	    return p;
	  }
	  static double N4fabbfd224(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 4;
	    } else if (((Double) i[3]).doubleValue() <= 9.217827762873636) {
	    p = WekaClassifier1.N14be9cdb25(i);
	    } else if (((Double) i[3]).doubleValue() > 9.217827762873636) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N14be9cdb25(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 9.106932997671674) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() > 9.106932997671674) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N6e2bf88026(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 0.05390070921985816) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() > 0.05390070921985816) {
	    p = WekaClassifier1.N8c7d40227(i);
	    } 
	    return p;
	  }
	  static double N8c7d40227(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 39.00816794045415) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 39.00816794045415) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N772fd3ce28(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 4;
	    } else if (((Double) i[3]).doubleValue() <= 8.970803317546306) {
	    p = WekaClassifier1.N64fab68329(i);
	    } else if (((Double) i[3]).doubleValue() > 8.970803317546306) {
	    p = WekaClassifier1.N7e4864030(i);
	    } 
	    return p;
	  }
	  static double N64fab68329(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() <= 592.0) {
	      p = 4;
	    } else if (((Double) i[1]).doubleValue() > 592.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7e4864030(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 54.33794098120472) {
	    p = WekaClassifier1.N2c29d7cc31(i);
	    } else if (((Double) i[0]).doubleValue() > 54.33794098120472) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c29d7cc31(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 545.0) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 545.0) {
	    p = WekaClassifier1.N6f16a8ba32(i);
	    } 
	    return p;
	  }
	  static double N6f16a8ba32(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 0.07943262411347518) {
	    p = WekaClassifier1.N389f845033(i);
	    } else if (((Double) i[2]).doubleValue() > 0.07943262411347518) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N389f845033(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 36.61294518543627) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 36.61294518543627) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N70a7bd3a34(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.375302301893012) {
	    p = WekaClassifier1.N1478649e35(i);
	    } else if (((Double) i[3]).doubleValue() > 9.375302301893012) {
	    p = WekaClassifier1.N5ce81ff998(i);
	    } 
	    return p;
	  }
	  static double N1478649e35(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 536.0) {
	    p = WekaClassifier1.N6c15cb9136(i);
	    } else if (((Double) i[1]).doubleValue() > 536.0) {
	    p = WekaClassifier1.N70f0e9c968(i);
	    } 
	    return p;
	  }
	  static double N6c15cb9136(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 76.36954715377405) {
	    p = WekaClassifier1.Nae7d40737(i);
	    } else if (((Double) i[0]).doubleValue() > 76.36954715377405) {
	    p = WekaClassifier1.N422e40245(i);
	    } 
	    return p;
	  }
	  static double Nae7d40737(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 9.27028230186845) {
	    p = WekaClassifier1.N7a111d2838(i);
	    } else if (((Double) i[3]).doubleValue() > 9.27028230186845) {
	    p = WekaClassifier1.N2bec961441(i);
	    } 
	    return p;
	  }
	  static double N7a111d2838(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 520.0) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 520.0) {
	    p = WekaClassifier1.N79916bb339(i);
	    } 
	    return p;
	  }
	  static double N79916bb339(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 53.74454469866146) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 53.74454469866146) {
	    p = WekaClassifier1.N3a35f31f40(i);
	    } 
	    return p;
	  }
	  static double N3a35f31f40(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() <= 0.1475177304964539) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() > 0.1475177304964539) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2bec961441(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 509.0) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() > 509.0) {
	    p = WekaClassifier1.N3971119342(i);
	    } 
	    return p;
	  }
	  static double N3971119342(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 9.327075351538396) {
	    p = WekaClassifier1.N2e38e75b43(i);
	    } else if (((Double) i[3]).doubleValue() > 9.327075351538396) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N2e38e75b43(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 527.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 527.0) {
	    p = WekaClassifier1.N19dd1f1244(i);
	    } 
	    return p;
	  }
	  static double N19dd1f1244(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 53.74454469866146) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 53.74454469866146) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N422e40245(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 5;
	    } else if (((Double) i[1]).doubleValue() <= 491.0) {
	      p = 5;
	    } else if (((Double) i[1]).doubleValue() > 491.0) {
	    p = WekaClassifier1.Nea7416d46(i);
	    } 
	    return p;
	  }
	  static double Nea7416d46(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.268891592660868) {
	    p = WekaClassifier1.N6b8629f47(i);
	    } else if (((Double) i[3]).doubleValue() > 9.268891592660868) {
	    p = WekaClassifier1.N19b3577b54(i);
	    } 
	    return p;
	  }
	  static double N6b8629f47(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.13900709219858157) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 0.13900709219858157) {
	    p = WekaClassifier1.N3352b82b48(i);
	    } 
	    return p;
	  }
	  static double N3352b82b48(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 524.0) {
	    p = WekaClassifier1.N7bb9295f49(i);
	    } else if (((Double) i[1]).doubleValue() > 524.0) {
	    p = WekaClassifier1.N25fb02551(i);
	    } 
	    return p;
	  }
	  static double N7bb9295f49(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 6;
	    } else if (((Double) i[0]).doubleValue() <= 102.25948621484794) {
	    p = WekaClassifier1.N394b5b6e50(i);
	    } else if (((Double) i[0]).doubleValue() > 102.25948621484794) {
	      p = 6;
	    } 
	    return p;
	  }
	  static double N394b5b6e50(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() <= 0.19290780141843972) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() > 0.19290780141843972) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N25fb02551(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.16103471320369) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 9.16103471320369) {
	    p = WekaClassifier1.N58254e5a52(i);
	    } 
	    return p;
	  }
	  static double N58254e5a52(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 534.0) {
	    p = WekaClassifier1.N793b23eb53(i);
	    } else if (((Double) i[1]).doubleValue() > 534.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N793b23eb53(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 117.93978421210778) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 117.93978421210778) {
	      p = 6;
	    } 
	    return p;
	  }
	  static double N19b3577b54(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 507.0) {
	    p = WekaClassifier1.N4d34596b55(i);
	    } else if (((Double) i[1]).doubleValue() > 507.0) {
	    p = WekaClassifier1.N38d79b6f59(i);
	    } 
	    return p;
	  }
	  static double N4d34596b55(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.319260067844315) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 9.319260067844315) {
	    p = WekaClassifier1.N27daa76656(i);
	    } 
	    return p;
	  }
	  static double N27daa76656(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 503.0) {
	    p = WekaClassifier1.N4242dfb57(i);
	    } else if (((Double) i[1]).doubleValue() > 503.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4242dfb57(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 497.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 497.0) {
	    p = WekaClassifier1.N6346bbdc58(i);
	    } 
	    return p;
	  }
	  static double N6346bbdc58(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.362884021748098) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 9.362884021748098) {
	      p = 5;
	    } 
	    return p;
	  }
	  static double N38d79b6f59(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.32056737588652484) {
	    p = WekaClassifier1.N531db19060(i);
	    } else if (((Double) i[2]).doubleValue() > 0.32056737588652484) {
	    p = WekaClassifier1.N5820e5f864(i);
	    } 
	    return p;
	  }
	  static double N531db19060(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 89.7872982993802) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 89.7872982993802) {
	    p = WekaClassifier1.N42748f9161(i);
	    } 
	    return p;
	  }
	  static double N42748f9161(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 518.0) {
	    p = WekaClassifier1.N727d9aac62(i);
	    } else if (((Double) i[1]).doubleValue() > 518.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N727d9aac62(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 511.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 511.0) {
	    p = WekaClassifier1.N1435cced63(i);
	    } 
	    return p;
	  }
	  static double N1435cced63(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.329161415349772) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 9.329161415349772) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5820e5f864(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 9.322096947276938) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() > 9.322096947276938) {
	    p = WekaClassifier1.N57da29fb65(i);
	    } 
	    return p;
	  }
	  static double N57da29fb65(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 519.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 519.0) {
	    p = WekaClassifier1.N33fa4acc66(i);
	    } 
	    return p;
	  }
	  static double N33fa4acc66(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 219.2855821433842) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 219.2855821433842) {
	    p = WekaClassifier1.N7544b1bc67(i);
	    } 
	    return p;
	  }
	  static double N7544b1bc67(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 332.15688154254013) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 332.15688154254013) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N70f0e9c968(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 8.842712874250132) {
	    p = WekaClassifier1.N5884c50c69(i);
	    } else if (((Double) i[3]).doubleValue() > 8.842712874250132) {
	    p = WekaClassifier1.N3a0e9cee81(i);
	    } 
	    return p;
	  }
	  static double N5884c50c69(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 580.0) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() > 580.0) {
	    p = WekaClassifier1.N74a4c43a70(i);
	    } 
	    return p;
	  }
	  static double N74a4c43a70(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 8.007878456691794) {
	    p = WekaClassifier1.N6d4ef7a971(i);
	    } else if (((Double) i[3]).doubleValue() > 8.007878456691794) {
	    p = WekaClassifier1.N711a416973(i);
	    } 
	    return p;
	  }
	  static double N6d4ef7a971(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 7.089975840770667) {
	    p = WekaClassifier1.N5b65b04f72(i);
	    } else if (((Double) i[3]).doubleValue() > 7.089975840770667) {
	      p = 6;
	    } 
	    return p;
	  }
	  static double N5b65b04f72(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() <= 0.1574468085106383) {
	      p = 6;
	    } else if (((Double) i[2]).doubleValue() > 0.1574468085106383) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N711a416973(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 606.0) {
	    p = WekaClassifier1.N72bc8e8174(i);
	    } else if (((Double) i[1]).doubleValue() > 606.0) {
	    p = WekaClassifier1.N392ff20075(i);
	    } 
	    return p;
	  }
	  static double N72bc8e8174(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 8.527451867864317) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 8.527451867864317) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N392ff20075(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 8.740941801963816) {
	    p = WekaClassifier1.N7ab8fb5476(i);
	    } else if (((Double) i[3]).doubleValue() > 8.740941801963816) {
	    p = WekaClassifier1.N557050e379(i);
	    } 
	    return p;
	  }
	  static double N7ab8fb5476(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 669.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 669.0) {
	    p = WekaClassifier1.N67c86be77(i);
	    } 
	    return p;
	  }
	  static double N67c86be77(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 8.367685131870964) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 8.367685131870964) {
	    p = WekaClassifier1.N5972274578(i);
	    } 
	    return p;
	  }
	  static double N5972274578(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 680.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 680.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N557050e379(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 645.0) {
	    p = WekaClassifier1.N40ce92e780(i);
	    } else if (((Double) i[1]).doubleValue() > 645.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N40ce92e780(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 43.679253377774785) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 43.679253377774785) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3a0e9cee81(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 3;
	    } else if (((Double) i[1]).doubleValue() <= 631.0) {
	    p = WekaClassifier1.N1560eb0982(i);
	    } else if (((Double) i[1]).doubleValue() > 631.0) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1560eb0982(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 9.062100520349995) {
	    p = WekaClassifier1.Nde6a6d683(i);
	    } else if (((Double) i[3]).doubleValue() > 9.062100520349995) {
	    p = WekaClassifier1.N1a53c64189(i);
	    } 
	    return p;
	  }
	  static double Nde6a6d683(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 566.0) {
	    p = WekaClassifier1.N21d332bb84(i);
	    } else if (((Double) i[1]).doubleValue() > 566.0) {
	    p = WekaClassifier1.Nf57942f87(i);
	    } 
	    return p;
	  }
	  static double N21d332bb84(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 9.040710001964957) {
	    p = WekaClassifier1.N30a7a45685(i);
	    } else if (((Double) i[3]).doubleValue() > 9.040710001964957) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N30a7a45685(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() <= 554.0) {
	      p = 6;
	    } else if (((Double) i[1]).doubleValue() > 554.0) {
	    p = WekaClassifier1.N4e16230e86(i);
	    } 
	    return p;
	  }
	  static double N4e16230e86(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() <= 8.90728456711918) {
	      p = 6;
	    } else if (((Double) i[3]).doubleValue() > 8.90728456711918) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nf57942f87(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 588.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 588.0) {
	    p = WekaClassifier1.N3ec1a18788(i);
	    } 
	    return p;
	  }
	  static double N3ec1a18788(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 8.945179301140248) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 8.945179301140248) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1a53c64189(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 0.27801418439716313) {
	    p = WekaClassifier1.N71fce2e790(i);
	    } else if (((Double) i[2]).doubleValue() > 0.27801418439716313) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N71fce2e790(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 9.207495546540098) {
	    p = WekaClassifier1.N1194e62891(i);
	    } else if (((Double) i[3]).doubleValue() > 9.207495546540098) {
	    p = WekaClassifier1.N3111c57693(i);
	    } 
	    return p;
	  }
	  static double N1194e62891(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 559.0) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 559.0) {
	    p = WekaClassifier1.N4692551c92(i);
	    } 
	    return p;
	  }
	  static double N4692551c92(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() <= 0.2425531914893617) {
	      p = 3;
	    } else if (((Double) i[2]).doubleValue() > 0.2425531914893617) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3111c57693(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 543.0) {
	    p = WekaClassifier1.N5badf2594(i);
	    } else if (((Double) i[1]).doubleValue() > 543.0) {
	    p = WekaClassifier1.N152966ca96(i);
	    } 
	    return p;
	  }
	  static double N5badf2594(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 9.30293414585236) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 9.30293414585236) {
	    p = WekaClassifier1.N2f8ff91395(i);
	    } 
	    return p;
	  }
	  static double N2f8ff91395(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 113.08133732883188) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 113.08133732883188) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N152966ca96(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 123.06872923650644) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 123.06872923650644) {
	    p = WekaClassifier1.N511b62a097(i);
	    } 
	    return p;
	  }
	  static double N511b62a097(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.2524822695035461) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 0.2524822695035461) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N5ce81ff998(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 76.91788192053248) {
	    p = WekaClassifier1.Nb8b441699(i);
	    } else if (((Double) i[0]).doubleValue() > 76.91788192053248) {
	      p = 5;
	    } 
	    return p;
	  }
	  static double Nb8b441699(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 68.16965618935318) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 68.16965618935318) {
	      p = 1;
	    } 
	    return p;
	  }
	}
