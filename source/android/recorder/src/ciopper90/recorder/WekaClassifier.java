package ciopper90.recorder;

public class WekaClassifier {

  public static int classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaClassifier.N6d6563190(i);
    return (int) p;
  }
  static double N6d6563190(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.106383) {
    p = WekaClassifier.N1b4d366b1(i);
    } else if (((Double) i[1]).doubleValue() > 0.106383) {
    p = WekaClassifier.N7c0127df30(i);
    } 
    return p;
  }
  static double N1b4d366b1(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6.718876) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 6.718876) {
    p = WekaClassifier.N6a2fb8cd2(i);
    } 
    return p;
  }
  static double N6a2fb8cd2(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 555.0) {
    p = WekaClassifier.N630dd1313(i);
    } else if (((Double) i[0]).doubleValue() > 555.0) {
    p = WekaClassifier.N8fc963a23(i);
    } 
    return p;
  }
  static double N630dd1313(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.058156) {
    p = WekaClassifier.N20211ac54(i);
    } else if (((Double) i[1]).doubleValue() > 0.058156) {
    p = WekaClassifier.N3f60506d16(i);
    } 
    return p;
  }
  static double N20211ac54(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.049645) {
    p = WekaClassifier.N5d648bfd5(i);
    } else if (((Double) i[1]).doubleValue() > 0.049645) {
    p = WekaClassifier.N40d2382e12(i);
    } 
    return p;
  }
  static double N5d648bfd5(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 9.022325) {
    p = WekaClassifier.N7422bef16(i);
    } else if (((Double) i[2]).doubleValue() > 9.022325) {
    p = WekaClassifier.N7fc57bfe9(i);
    } 
    return p;
  }
  static double N7422bef16(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 486.0) {
    p = WekaClassifier.N1525fbc87(i);
    } else if (((Double) i[0]).doubleValue() > 486.0) {
      p = 4;
    } 
    return p;
  }
  static double N1525fbc87(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.032624) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.032624) {
    p = WekaClassifier.N70b512508(i);
    } 
    return p;
  }
  static double N70b512508(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 473.0) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 473.0) {
      p = 4;
    } 
    return p;
  }
  static double N7fc57bfe9(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 488.0) {
    p = WekaClassifier.N7e4fa23a10(i);
    } else if (((Double) i[0]).doubleValue() > 488.0) {
      p = 4;
    } 
    return p;
  }
  static double N7e4fa23a10(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.038298) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.038298) {
    p = WekaClassifier.N1e23ce9f11(i);
    } 
    return p;
  }
  static double N1e23ce9f11(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.337352) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() > 9.337352) {
      p = 2;
    } 
    return p;
  }
  static double N40d2382e12(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.260381) {
    p = WekaClassifier.N2966754113(i);
    } else if (((Double) i[2]).doubleValue() > 9.260381) {
    p = WekaClassifier.N49cd353515(i);
    } 
    return p;
  }
  static double N2966754113(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.055319) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.055319) {
    p = WekaClassifier.N59c13a314(i);
    } 
    return p;
  }
  static double N59c13a314(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.102709) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() > 9.102709) {
      p = 2;
    } 
    return p;
  }
  static double N49cd353515(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 511.0) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 511.0) {
      p = 4;
    } 
    return p;
  }
  static double N3f60506d16(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 518.0) {
    p = WekaClassifier.N4c40449c17(i);
    } else if (((Double) i[0]).doubleValue() > 518.0) {
    p = WekaClassifier.N7c7b95fe19(i);
    } 
    return p;
  }
  static double N4c40449c17(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 9.081922) {
    p = WekaClassifier.Nf5884e018(i);
    } else if (((Double) i[2]).doubleValue() > 9.081922) {
      p = 2;
    } 
    return p;
  }
  static double Nf5884e018(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.068085) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.068085) {
      p = 2;
    } 
    return p;
  }
  static double N7c7b95fe19(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.286608) {
    p = WekaClassifier.N15b4968b20(i);
    } else if (((Double) i[2]).doubleValue() > 9.286608) {
      p = 2;
    } 
    return p;
  }
  static double N15b4968b20(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.068085) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.068085) {
    p = WekaClassifier.N3078acf21(i);
    } 
    return p;
  }
  static double N3078acf21(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.099589) {
    p = WekaClassifier.N642a1d9622(i);
    } else if (((Double) i[2]).doubleValue() > 9.099589) {
      p = 2;
    } 
    return p;
  }
  static double N642a1d9622(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 9.026434) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() > 9.026434) {
      p = 1;
    } 
    return p;
  }
  static double N8fc963a23(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 592.0) {
    p = WekaClassifier.N7eeabe7124(i);
    } else if (((Double) i[0]).doubleValue() > 592.0) {
    p = WekaClassifier.N7d4aa51626(i);
    } 
    return p;
  }
  static double N7eeabe7124(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 9.025738) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() > 9.025738) {
    p = WekaClassifier.N657d2dcf25(i);
    } 
    return p;
  }
  static double N657d2dcf25(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.066667) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.066667) {
      p = 3;
    } 
    return p;
  }
  static double N7d4aa51626(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 701.0) {
    p = WekaClassifier.N2f9c879d27(i);
    } else if (((Double) i[0]).doubleValue() > 701.0) {
      p = 3;
    } 
    return p;
  }
  static double N2f9c879d27(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.287758) {
    p = WekaClassifier.N4d8b6cd628(i);
    } else if (((Double) i[2]).doubleValue() > 8.287758) {
    p = WekaClassifier.N7c967d5f29(i);
    } 
    return p;
  }
  static double N4d8b6cd628(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 7.658816) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 7.658816) {
      p = 1;
    } 
    return p;
  }
  static double N7c967d5f29(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.102128) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.102128) {
      p = 1;
    } 
    return p;
  }
  static double N7c0127df30(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 9.361118) {
    p = WekaClassifier.N2fe0e11331(i);
    } else if (((Double) i[2]).doubleValue() > 9.361118) {
    p = WekaClassifier.N5e521d7471(i);
    } 
    return p;
  }
  static double N2fe0e11331(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 6;
    } else if (((Double) i[0]).doubleValue() <= 539.0) {
    p = WekaClassifier.N54d8bef332(i);
    } else if (((Double) i[0]).doubleValue() > 539.0) {
    p = WekaClassifier.N2e07cfba52(i);
    } 
    return p;
  }
  static double N54d8bef332(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 484.0) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 484.0) {
    p = WekaClassifier.N61e06f0933(i);
    } 
    return p;
  }
  static double N61e06f0933(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 9.217828) {
    p = WekaClassifier.N5599ea1234(i);
    } else if (((Double) i[2]).doubleValue() > 9.217828) {
    p = WekaClassifier.N4188bf2239(i);
    } 
    return p;
  }
  static double N5599ea1234(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.141844) {
    p = WekaClassifier.N6bd66fa535(i);
    } else if (((Double) i[1]).doubleValue() > 0.141844) {
    p = WekaClassifier.N4c47c67437(i);
    } 
    return p;
  }
  static double N6bd66fa535(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 9.133361) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() > 9.133361) {
    p = WekaClassifier.N4b3bf0f236(i);
    } 
    return p;
  }
  static double N4b3bf0f236(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.131915) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.131915) {
      p = 1;
    } 
    return p;
  }
  static double N4c47c67437(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 9.050433) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() > 9.050433) {
    p = WekaClassifier.N7c3610cb38(i);
    } 
    return p;
  }
  static double N7c3610cb38(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.163121) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.163121) {
      p = 6;
    } 
    return p;
  }
  static double N4188bf2239(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.156028) {
    p = WekaClassifier.N78bc72ca40(i);
    } else if (((Double) i[1]).doubleValue() > 0.156028) {
    p = WekaClassifier.N66bdb2cb45(i);
    } 
    return p;
  }
  static double N78bc72ca40(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 509.0) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 509.0) {
    p = WekaClassifier.N1c1469b341(i);
    } 
    return p;
  }
  static double N1c1469b341(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 9.320331) {
    p = WekaClassifier.N27752c42(i);
    } else if (((Double) i[2]).doubleValue() > 9.320331) {
      p = 3;
    } 
    return p;
  }
  static double N27752c42(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 525.0) {
    p = WekaClassifier.N1e7d9bc843(i);
    } else if (((Double) i[0]).doubleValue() > 525.0) {
      p = 3;
    } 
    return p;
  }
  static double N1e7d9bc843(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 512.0) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 512.0) {
    p = WekaClassifier.N487e771b44(i);
    } 
    return p;
  }
  static double N487e771b44(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 516.0) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 516.0) {
      p = 1;
    } 
    return p;
  }
  static double N66bdb2cb45(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 6;
    } else if (((Double) i[0]).doubleValue() <= 515.0) {
    p = WekaClassifier.N3025621f46(i);
    } else if (((Double) i[0]).doubleValue() > 515.0) {
    p = WekaClassifier.N49b58c3451(i);
    } 
    return p;
  }
  static double N3025621f46(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 6;
    } else if (((Double) i[1]).doubleValue() <= 0.350355) {
    p = WekaClassifier.N664cf9ea47(i);
    } else if (((Double) i[1]).doubleValue() > 0.350355) {
      p = 1;
    } 
    return p;
  }
  static double N664cf9ea47(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 9.348324) {
    p = WekaClassifier.N47aba61e48(i);
    } else if (((Double) i[2]).doubleValue() > 9.348324) {
    p = WekaClassifier.N22bb96fc50(i);
    } 
    return p;
  }
  static double N47aba61e48(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 496.0) {
    p = WekaClassifier.N5627205449(i);
    } else if (((Double) i[0]).doubleValue() > 496.0) {
      p = 6;
    } 
    return p;
  }
  static double N5627205449(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() <= 0.259574) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() > 0.259574) {
      p = 6;
    } 
    return p;
  }
  static double N22bb96fc50(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 504.0) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 504.0) {
      p = 5;
    } 
    return p;
  }
  static double N49b58c3451(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.319149) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.319149) {
      p = 3;
    } 
    return p;
  }
  static double N2e07cfba52(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.792628) {
    p = WekaClassifier.N2d6d3f253(i);
    } else if (((Double) i[2]).doubleValue() > 8.792628) {
    p = WekaClassifier.N5d6ed9cb58(i);
    } 
    return p;
  }
  static double N2d6d3f253(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 6;
    } else if (((Double) i[0]).doubleValue() <= 613.0) {
    p = WekaClassifier.N65f4b65254(i);
    } else if (((Double) i[0]).doubleValue() > 613.0) {
    p = WekaClassifier.N2a3721056(i);
    } 
    return p;
  }
  static double N65f4b65254(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.153191) {
    p = WekaClassifier.N24edf5c955(i);
    } else if (((Double) i[1]).doubleValue() > 0.153191) {
      p = 6;
    } 
    return p;
  }
  static double N24edf5c955(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 602.0) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 602.0) {
      p = 1;
    } 
    return p;
  }
  static double N2a3721056(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 7.824784) {
    p = WekaClassifier.N389579ca57(i);
    } else if (((Double) i[2]).doubleValue() > 7.824784) {
      p = 1;
    } 
    return p;
  }
  static double N389579ca57(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 6;
    } else if (((Double) i[1]).doubleValue() <= 0.214184) {
      p = 6;
    } else if (((Double) i[1]).doubleValue() > 0.214184) {
      p = 0;
    } 
    return p;
  }
  static double N5d6ed9cb58(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 613.0) {
    p = WekaClassifier.N189cce5959(i);
    } else if (((Double) i[0]).doubleValue() > 613.0) {
      p = 3;
    } 
    return p;
  }
  static double N189cce5959(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 9.108241) {
    p = WekaClassifier.N5eaf41ae60(i);
    } else if (((Double) i[2]).doubleValue() > 9.108241) {
    p = WekaClassifier.N168c65869(i);
    } 
    return p;
  }
  static double N5eaf41ae60(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 6;
    } else if (((Double) i[0]).doubleValue() <= 558.0) {
    p = WekaClassifier.N4401371261(i);
    } else if (((Double) i[0]).doubleValue() > 558.0) {
    p = WekaClassifier.N7d9ce42c63(i);
    } 
    return p;
  }
  static double N4401371261(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (((Double) i[2]).doubleValue() <= 9.076999) {
    p = WekaClassifier.N2bc6a19f62(i);
    } else if (((Double) i[2]).doubleValue() > 9.076999) {
      p = 1;
    } 
    return p;
  }
  static double N2bc6a19f62(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 6;
    } else if (((Double) i[1]).doubleValue() <= 0.259574) {
      p = 6;
    } else if (((Double) i[1]).doubleValue() > 0.259574) {
      p = 1;
    } 
    return p;
  }
  static double N7d9ce42c63(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.973406) {
    p = WekaClassifier.N4748452164(i);
    } else if (((Double) i[2]).doubleValue() > 8.973406) {
    p = WekaClassifier.N7b28426667(i);
    } 
    return p;
  }
  static double N4748452164(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 608.0) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 608.0) {
    p = WekaClassifier.N59b29e1665(i);
    } 
    return p;
  }
  static double N59b29e1665(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.8863) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 8.8863) {
    p = WekaClassifier.N5da8e45b66(i);
    } 
    return p;
  }
  static double N5da8e45b66(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.259574) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.259574) {
      p = 1;
    } 
    return p;
  }
  static double N7b28426667(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.153191) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.153191) {
    p = WekaClassifier.N101f75b568(i);
    } 
    return p;
  }
  static double N101f75b568(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 589.0) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 589.0) {
      p = 3;
    } 
    return p;
  }
  static double N168c65869(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 562.0) {
    p = WekaClassifier.N5b5bc2170(i);
    } else if (((Double) i[0]).doubleValue() > 562.0) {
      p = 3;
    } 
    return p;
  }
  static double N5b5bc2170(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 9.214615) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 9.214615) {
      p = 3;
    } 
    return p;
  }
  static double N5e521d7471(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.134752) {
    p = WekaClassifier.N610bdb0c72(i);
    } else if (((Double) i[1]).doubleValue() > 0.134752) {
    p = WekaClassifier.N3e35233676(i);
    } 
    return p;
  }
  static double N610bdb0c72(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 485.0) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 485.0) {
    p = WekaClassifier.N515a229a73(i);
    } 
    return p;
  }
  static double N515a229a73(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 9.375998) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 9.375998) {
    p = WekaClassifier.N7495d62f74(i);
    } 
    return p;
  }
  static double N7495d62f74(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 9.396927) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() > 9.396927) {
    p = WekaClassifier.N1920e37575(i);
    } 
    return p;
  }
  static double N1920e37575(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.10922) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.10922) {
      p = 3;
    } 
    return p;
  }
  static double N3e35233676(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 516.0) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 516.0) {
    p = WekaClassifier.N129ace2277(i);
    } 
    return p;
  }
  static double N129ace2277(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() <= 0.265248) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() > 0.265248) {
    p = WekaClassifier.N715323b878(i);
    } 
    return p;
  }
  static double N715323b878(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 527.0) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 527.0) {
      p = 1;
    } 
    return p;
  }
}
