package com.example.restro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.android.tools.ir.runtime.IncrementalChange;
import com.android.tools.ir.runtime.InstantReloadException;

public class MainActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IncrementalChange $change = null;
    public static final long serialVersionUID = -390018945358850208L;

    MainActivity(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[1];
        int hashCode = str.hashCode();
        if (hashCode == -2089128195) {
            return;
        }
        if (hashCode == -1356533862) {
            this();
        } else {
            throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/restro/MainActivity"}));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.example.restro.MainActivity, code=android.support.v4.app.FragmentActivity, for r13v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, android.view.ContextThemeWrapper, java.lang.Object, com.example.restro.MainActivity, android.content.ContextWrapper, android.app.Activity, android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object access$super(android.support.v4.app.FragmentActivity r13, java.lang.String r14, java.lang.Object... r15) {
        /*
            int r1 = r14.hashCode()
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            switch(r1) {
                case -2147180915: goto L_0x1259;
                case -2146661417: goto L_0x124d;
                case -2128160755: goto L_0x1248;
                case -2119242196: goto L_0x123f;
                case -2116008609: goto L_0x1233;
                case -2067683862: goto L_0x1219;
                case -2042375299: goto L_0x120d;
                case -2012646654: goto L_0x1201;
                case -2012012406: goto L_0x11f3;
                case -2006928146: goto L_0x11da;
                case -2001885447: goto L_0x11d6;
                case -1991028125: goto L_0x11d1;
                case -1989445603: goto L_0x11cd;
                case -1973108070: goto L_0x11bd;
                case -1970257541: goto L_0x11b1;
                case -1949484118: goto L_0x11a5;
                case -1935838630: goto L_0x1198;
                case -1932934201: goto L_0x1190;
                case -1929117203: goto L_0x118c;
                case -1920723310: goto L_0x1180;
                case -1920144170: goto L_0x117b;
                case -1910120743: goto L_0x116a;
                case -1891394210: goto L_0x1165;
                case -1833452664: goto L_0x114d;
                case -1824869760: goto L_0x113f;
                case -1811304260: goto L_0x1135;
                case -1796734047: goto L_0x111f;
                case -1786273732: goto L_0x111b;
                case -1781634548: goto L_0x1117;
                case -1772888905: goto L_0x110b;
                case -1754231978: goto L_0x10ff;
                case -1749129850: goto L_0x10f3;
                case -1744479168: goto L_0x10eb;
                case -1725075920: goto L_0x10e6;
                case -1715303871: goto L_0x10de;
                case -1708008179: goto L_0x10da;
                case -1700762698: goto L_0x10d6;
                case -1689367812: goto L_0x10d1;
                case -1663345066: goto L_0x10c5;
                case -1653906805: goto L_0x10b9;
                case -1651465300: goto L_0x10b1;
                case -1648999705: goto L_0x10ac;
                case -1635453101: goto L_0x109e;
                case -1630383126: goto L_0x108a;
                case -1628464379: goto L_0x105b;
                case -1601511123: goto L_0x104b;
                case -1597737654: goto L_0x1043;
                case -1596168386: goto L_0x1029;
                case -1580823932: goto L_0x101b;
                case -1567038203: goto L_0x100b;
                case -1563438637: goto L_0x1003;
                case -1563053631: goto L_0x0ffe;
                case -1554832987: goto L_0x0ffa;
                case -1545899961: goto L_0x0ff0;
                case -1526884382: goto L_0x0fe0;
                case -1512679303: goto L_0x0fc4;
                case -1512649357: goto L_0x0fc0;
                case -1510369713: goto L_0x0fb2;
                case -1504501726: goto L_0x0fae;
                case -1502047401: goto L_0x0f9a;
                case -1485318024: goto L_0x0f95;
                case -1483807804: goto L_0x0f84;
                case -1467836826: goto L_0x0f70;
                case -1447998406: goto L_0x0f62;
                case -1446660257: goto L_0x0f5a;
                case -1398848845: goto L_0x0f56;
                case -1388205895: goto L_0x0f40;
                case -1381466698: goto L_0x0f38;
                case -1377658544: goto L_0x0f33;
                case -1364880825: goto L_0x0f1f;
                case -1362550164: goto L_0x0f16;
                case -1360644566: goto L_0x0f08;
                case -1349865163: goto L_0x0ef2;
                case -1344529914: goto L_0x0ee6;
                case -1330876624: goto L_0x0edc;
                case -1327523470: goto L_0x0ed7;
                case -1291272994: goto L_0x0ed2;
                case -1274460991: goto L_0x0ec8;
                case -1264569478: goto L_0x0ec4;
                case -1261436153: goto L_0x0ebf;
                case -1258591458: goto L_0x0eba;
                case -1238136363: goto L_0x0eb2;
                case -1237633061: goto L_0x0ea8;
                case -1218355944: goto L_0x0e98;
                case -1211749994: goto L_0x0e8b;
                case -1188103088: goto L_0x0e86;
                case -1158180317: goto L_0x0e7d;
                case -1145345097: goto L_0x0e6f;
                case -1141736541: goto L_0x0e3a;
                case -1120807196: goto L_0x0e35;
                case -1116895675: goto L_0x0e24;
                case -1115540218: goto L_0x0e1b;
                case -1115381115: goto L_0x0e0b;
                case -1110176650: goto L_0x0dfa;
                case -1107583308: goto L_0x0df1;
                case -1106401236: goto L_0x0de9;
                case -1076054347: goto L_0x0de1;
                case -1053855858: goto L_0x0dd9;
                case -1025252350: goto L_0x0dd1;
                case -1024841183: goto L_0x0dcc;
                case -1021472056: goto L_0x0dc0;
                case -1021247703: goto L_0x0dae;
                case -978110490: goto L_0x0d9d;
                case -976790220: goto L_0x0d98;
                case -962742886: goto L_0x0d8c;
                case -956832564: goto L_0x0d84;
                case -946928039: goto L_0x0d7b;
                case -936794346: goto L_0x0d6f;
                case -908335631: goto L_0x0d57;
                case -894847381: goto L_0x0d49;
                case -889668642: goto L_0x0d45;
                case -884160602: goto L_0x0d2f;
                case -860668327: goto L_0x0d2b;
                case -842839078: goto L_0x0d26;
                case -834926630: goto L_0x0d1a;
                case -813556434: goto L_0x0d0d;
                case -801135301: goto L_0x0d09;
                case -787701764: goto L_0x0d04;
                case -783742144: goto L_0x0cf4;
                case -783227656: goto L_0x0cec;
                case -775132968: goto L_0x0ce7;
                case -772306106: goto L_0x0cd3;
                case -771598921: goto L_0x0cce;
                case -754148941: goto L_0x0cba;
                case -739997161: goto L_0x0cb2;
                case -731685428: goto L_0x0c9e;
                case -730211576: goto L_0x0c88;
                case -663187577: goto L_0x0c7e;
                case -657193226: goto L_0x0c76;
                case -645158372: goto L_0x0c6e;
                case -641568046: goto L_0x0c66;
                case -632893333: goto L_0x0c50;
                case -626801900: goto L_0x0c4b;
                case -623553922: goto L_0x0c43;
                case -600646834: goto L_0x0c12;
                case -593599514: goto L_0x0bfc;
                case -583985582: goto L_0x0bf7;
                case -579928354: goto L_0x0bee;
                case -565022709: goto L_0x0be2;
                case -561536166: goto L_0x0bdd;
                case -543045568: goto L_0x0bcd;
                case -533115309: goto L_0x0bbd;
                case -523441978: goto L_0x0bb5;
                case -521108148: goto L_0x0ba7;
                case -485599684: goto L_0x0b9b;
                case -451962688: goto L_0x0b93;
                case -449658531: goto L_0x0b83;
                case -445489924: goto L_0x0b77;
                case -440799600: goto L_0x0b72;
                case -432656633: goto L_0x0b5e;
                case -428399392: goto L_0x0b56;
                case -427921124: goto L_0x0b4e;
                case -412857127: goto L_0x0b3d;
                case -406270088: goto L_0x0b28;
                case -406251089: goto L_0x0af2;
                case -389284119: goto L_0x0ae9;
                case -386103215: goto L_0x0aad;
                case -370434026: goto L_0x0aa4;
                case -367936228: goto L_0x0a96;
                case -349229044: goto L_0x0a8e;
                case -328499411: goto L_0x0a86;
                case -322248589: goto L_0x0a74;
                case -315360737: goto L_0x0a5e;
                case -300700976: goto L_0x0a59;
                case -299620925: goto L_0x0a51;
                case -294950962: goto L_0x0a41;
                case -293022599: goto L_0x0a39;
                case -280716353: goto L_0x0a1f;
                case -268822846: goto L_0x0a13;
                case -261153143: goto L_0x0a05;
                case -257219777: goto L_0x0a00;
                case -256744805: goto L_0x09e2;
                case -244620436: goto L_0x09da;
                case -242751949: goto L_0x09c8;
                case -237096951: goto L_0x09c3;
                case -237085799: goto L_0x09b1;
                case -236884974: goto L_0x09ad;
                case -232347918: goto L_0x09a0;
                case -212501619: goto L_0x0998;
                case -201279008: goto L_0x0994;
                case -199913269: goto L_0x098f;
                case -191939775: goto L_0x098b;
                case -182141982: goto L_0x0983;
                case -159635284: goto L_0x097b;
                case -157574108: goto L_0x096f;
                case -129020188: goto L_0x0961;
                case -124775396: goto L_0x0947;
                case -92595176: goto L_0x093f;
                case -61650832: goto L_0x093a;
                case -51098230: goto L_0x092e;
                case -49297836: goto L_0x0922;
                case -40033047: goto L_0x0911;
                case 28656581: goto L_0x0908;
                case 33078750: goto L_0x08f0;
                case 66113232: goto L_0x08e8;
                case 71602588: goto L_0x08e0;
                case 77731138: goto L_0x08d4;
                case 82670668: goto L_0x08b8;
                case 105425515: goto L_0x089b;
                case 114588953: goto L_0x088f;
                case 116272469: goto L_0x0887;
                case 127696083: goto L_0x0882;
                case 133027723: goto L_0x087a;
                case 134332931: goto L_0x0866;
                case 143326307: goto L_0x0862;
                case 151409432: goto L_0x085d;
                case 154887605: goto L_0x0839;
                case 179534607: goto L_0x0825;
                case 188604040: goto L_0x0821;
                case 189950177: goto L_0x081c;
                case 192936453: goto L_0x0813;
                case 201261558: goto L_0x080e;
                case 209747477: goto L_0x0809;
                case 215736879: goto L_0x07f5;
                case 223198551: goto L_0x07eb;
                case 224771354: goto L_0x07e1;
                case 256941319: goto L_0x07d7;
                case 264300484: goto L_0x07d2;
                case 277776542: goto L_0x07cd;
                case 311605593: goto L_0x07c8;
                case 323739864: goto L_0x07bc;
                case 323816587: goto L_0x07af;
                case 342401934: goto L_0x07a3;
                case 356149802: goto L_0x0797;
                case 361598322: goto L_0x0781;
                case 361690892: goto L_0x077c;
                case 366229479: goto L_0x0766;
                case 369126896: goto L_0x075c;
                case 389417251: goto L_0x0750;
                case 402547913: goto L_0x0744;
                case 430677542: goto L_0x073f;
                case 432240098: goto L_0x073b;
                case 468603210: goto L_0x0725;
                case 474698654: goto L_0x0721;
                case 488359506: goto L_0x071c;
                case 498687345: goto L_0x0717;
                case 506020951: goto L_0x0712;
                case 508196455: goto L_0x0706;
                case 514894248: goto L_0x06fe;
                case 517731866: goto L_0x06ec;
                case 533817968: goto L_0x06e2;
                case 554472204: goto L_0x06d6;
                case 557411162: goto L_0x06d1;
                case 592925556: goto L_0x06c9;
                case 595642473: goto L_0x06c5;
                case 600947343: goto L_0x06c1;
                case 602429250: goto L_0x06ad;
                case 603335571: goto L_0x06a1;
                case 630071634: goto L_0x066f;
                case 647580201: goto L_0x0649;
                case 663239282: goto L_0x063f;
                case 664773775: goto L_0x063a;
                case 677056085: goto L_0x0630;
                case 689402016: goto L_0x0626;
                case 698237531: goto L_0x0618;
                case 712753272: goto L_0x0613;
                case 743397380: goto L_0x05ee;
                case 746849712: goto L_0x05e5;
                case 757106516: goto L_0x05d3;
                case 761478486: goto L_0x05ce;
                case 782036510: goto L_0x05c0;
                case 797441118: goto L_0x05bc;
                case 812243512: goto L_0x05b4;
                case 819840342: goto L_0x05ac;
                case 831436057: goto L_0x05a0;
                case 850345319: goto L_0x0598;
                case 885118356: goto L_0x0594;
                case 886139607: goto L_0x058f;
                case 889348063: goto L_0x057d;
                case 900905503: goto L_0x0575;
                case 902425770: goto L_0x0565;
                case 921927566: goto L_0x0559;
                case 922616583: goto L_0x0554;
                case 944385474: goto L_0x0542;
                case 949399698: goto L_0x053e;
                case 957566518: goto L_0x0534;
                case 966976865: goto L_0x0523;
                case 968107227: goto L_0x051f;
                case 975965057: goto L_0x051a;
                case 978076981: goto L_0x050e;
                case 980588494: goto L_0x04f6;
                case 981214139: goto L_0x04ea;
                case 1006716585: goto L_0x04dc;
                case 1025294348: goto L_0x04d4;
                case 1047335636: goto L_0x04c3;
                case 1049763651: goto L_0x04bb;
                case 1055225029: goto L_0x04b7;
                case 1062055011: goto L_0x04b2;
                case 1065143297: goto L_0x04a5;
                case 1067388306: goto L_0x0494;
                case 1070024805: goto L_0x0482;
                case 1070661222: goto L_0x046d;
                case 1082051997: goto L_0x0463;
                case 1084679948: goto L_0x045e;
                case 1106102624: goto L_0x0451;
                case 1111017016: goto L_0x0445;
                case 1123733599: goto L_0x043b;
                case 1150324634: goto L_0x0437;
                case 1182266256: goto L_0x0432;
                case 1199311782: goto L_0x0429;
                case 1208144271: goto L_0x041d;
                case 1220607435: goto L_0x0418;
                case 1222830949: goto L_0x040f;
                case 1235912506: goto L_0x0407;
                case 1246973220: goto L_0x03f9;
                case 1257714799: goto L_0x03e1;
                case 1258286393: goto L_0x03d9;
                case 1260281423: goto L_0x03cb;
                case 1264052993: goto L_0x03c3;
                case 1270686685: goto L_0x03bf;
                case 1278144004: goto L_0x03ba;
                case 1281559479: goto L_0x03b6;
                case 1284851429: goto L_0x03b1;
                case 1288659661: goto L_0x03a9;
                case 1298332573: goto L_0x039d;
                case 1308233817: goto L_0x038f;
                case 1320984464: goto L_0x0382;
                case 1340357437: goto L_0x036d;
                case 1357142347: goto L_0x0331;
                case 1391904137: goto L_0x0313;
                case 1403628309: goto L_0x0309;
                case 1428545341: goto L_0x02fd;
                case 1437166753: goto L_0x02d2;
                case 1464460400: goto L_0x02cd;
                case 1474035477: goto L_0x029c;
                case 1479324538: goto L_0x0292;
                case 1515366061: goto L_0x0289;
                case 1525338969: goto L_0x0285;
                case 1538025040: goto L_0x0259;
                case 1542479423: goto L_0x0250;
                case 1553572081: goto L_0x0247;
                case 1609189330: goto L_0x023d;
                case 1609275863: goto L_0x0231;
                case 1609329947: goto L_0x0223;
                case 1614070695: goto L_0x0215;
                case 1615975956: goto L_0x01ea;
                case 1617604079: goto L_0x01e6;
                case 1626033557: goto L_0x01e2;
                case 1627836879: goto L_0x01d4;
                case 1629601113: goto L_0x01ca;
                case 1683598447: goto L_0x01c2;
                case 1685568843: goto L_0x01b5;
                case 1718256830: goto L_0x01a7;
                case 1765014364: goto L_0x019d;
                case 1770587104: goto L_0x0191;
                case 1814730534: goto L_0x0185;
                case 1824337728: goto L_0x016f;
                case 1835627922: goto L_0x0167;
                case 1842319466: goto L_0x0159;
                case 1867171439: goto L_0x014d;
                case 1874373038: goto L_0x0140;
                case 1876348903: goto L_0x0138;
                case 1877256764: goto L_0x012c;
                case 1879378497: goto L_0x0124;
                case 1893326613: goto L_0x0116;
                case 1908229466: goto L_0x0111;
                case 1940660514: goto L_0x010c;
                case 1944176744: goto L_0x0108;
                case 1984083782: goto L_0x0103;
                case 1992548598: goto L_0x00ea;
                case 1996274778: goto L_0x00da;
                case 1996959810: goto L_0x00d5;
                case 2000782320: goto L_0x00c9;
                case 2008219788: goto L_0x00b5;
                case 2025021518: goto L_0x00b0;
                case 2038901213: goto L_0x00a8;
                case 2039712810: goto L_0x00a3;
                case 2051394150: goto L_0x007e;
                case 2058746343: goto L_0x0070;
                case 2064626307: goto L_0x006b;
                case 2066955307: goto L_0x0067;
                case 2075560917: goto L_0x0059;
                case 2079339533: goto L_0x004d;
                case 2095084022: goto L_0x0049;
                case 2125332505: goto L_0x003b;
                case 2133689546: goto L_0x0037;
                case 2134622042: goto L_0x0033;
                case 2136601924: goto L_0x002e;
                default: goto L_0x0010;
            }
        L_0x0010:
            com.android.tools.ir.runtime.InstantReloadException r0 = new com.android.tools.ir.runtime.InstantReloadException
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r10] = r14
            int r2 = r14.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            java.lang.String r2 = "com/example/restro/MainActivity"
            r1[r7] = r2
            java.lang.String r2 = "String switch could not find '%s' with hashcode %s in %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x002e:
            android.view.Window r0 = com.example.restro.MainActivity.super.getWindow()
            return r0
        L_0x0033:
            com.example.restro.MainActivity.super.supportInvalidateOptionsMenu()
            return r9
        L_0x0037:
            com.example.restro.MainActivity.super.onStart()
            return r9
        L_0x003b:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = com.example.restro.MainActivity.super.supportShouldUpRecreateTask(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0049:
            com.example.restro.MainActivity.super.recreate()
            return r9
        L_0x004d:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setProgress(r1)
            return r9
        L_0x0059:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchTouchEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0067:
            com.example.restro.MainActivity.super.onEnterAnimationComplete()
            return r9
        L_0x006b:
            android.content.res.AssetManager r0 = com.example.restro.MainActivity.super.getAssets()
            return r0
        L_0x0070:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchGenericMotionEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x007e:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r15[r5]
            java.lang.String r5 = (java.lang.String) r5
            r0 = r13
            com.example.restro.MainActivity.super.enforceUriPermission(r1, r2, r3, r4, r5)
            return r9
        L_0x00a3:
            java.io.File[] r0 = com.example.restro.MainActivity.super.getExternalCacheDirs()
            return r0
        L_0x00a8:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.sendBroadcast(r1)
            return r9
        L_0x00b0:
            java.lang.Object r0 = com.example.restro.MainActivity.super.clone()
            return r0
        L_0x00b5:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            android.net.Uri r2 = (android.net.Uri) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            com.example.restro.MainActivity.super.grantUriPermission(r1, r2, r3)
            return r9
        L_0x00c9:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.removeDialog(r1)
            return r9
        L_0x00d5:
            android.support.v4.app.LoaderManager r0 = com.example.restro.MainActivity.super.getSupportLoaderManager()
            return r0
        L_0x00da:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            com.example.restro.MainActivity.super.setResult(r1, r2)
            return r9
        L_0x00ea:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.database.sqlite.SQLiteDatabase$CursorFactory r3 = (android.database.sqlite.SQLiteDatabase.CursorFactory) r3
            r4 = r15[r6]
            android.database.DatabaseErrorHandler r4 = (android.database.DatabaseErrorHandler) r4
            android.database.sqlite.SQLiteDatabase r0 = com.example.restro.MainActivity.super.openOrCreateDatabase(r1, r2, r3, r4)
            return r0
        L_0x0103:
            android.content.res.Resources$Theme r0 = com.example.restro.MainActivity.super.getTheme()
            return r0
        L_0x0108:
            com.example.restro.MainActivity.super.startPostponedEnterTransition()
            return r9
        L_0x010c:
            java.io.File[] r0 = com.example.restro.MainActivity.super.getObbDirs()
            return r0
        L_0x0111:
            java.io.File r0 = com.example.restro.MainActivity.super.getFilesDir()
            return r0
        L_0x0116:
            r1 = r15[r10]
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r0 = com.example.restro.MainActivity.super.onOptionsItemSelected(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0124:
            r1 = r15[r10]
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.example.restro.MainActivity.super.setTitle(r1)
            return r9
        L_0x012c:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r15[r8]
            android.os.PersistableBundle r2 = (android.os.PersistableBundle) r2
            com.example.restro.MainActivity.super.onCreate(r1, r2)
            return r9
        L_0x0138:
            r1 = r15[r10]
            android.view.Menu r1 = (android.view.Menu) r1
            com.example.restro.MainActivity.super.onOptionsMenuClosed(r1)
            return r9
        L_0x0140:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.view.View r0 = com.example.restro.MainActivity.super.findViewById(r1)
            return r0
        L_0x014d:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            r2 = r15[r8]
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            com.example.restro.MainActivity.super.addContentView(r1, r2)
            return r9
        L_0x0159:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchTrackballEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0167:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.example.restro.MainActivity.super.onPostCreate(r1)
            return r9
        L_0x016f:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            boolean r0 = com.example.restro.MainActivity.super.startActivityIfNeeded(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0185:
            r1 = r15[r10]
            boolean r0 = com.example.restro.MainActivity.super.equals(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0191:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setContentView(r1)
            return r9
        L_0x019d:
            boolean r0 = com.example.restro.MainActivity.super.isTaskRoot()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x01a7:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.example.restro.MainActivity.super.checkCallingOrSelfPermission(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x01b5:
            r1 = r15[r10]
            android.util.AttributeSet r1 = (android.util.AttributeSet) r1
            r2 = r15[r8]
            int[] r2 = (int[]) r2
            android.content.res.TypedArray r0 = com.example.restro.MainActivity.super.obtainStyledAttributes(r1, r2)
            return r0
        L_0x01c2:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            com.example.restro.MainActivity.super.setContentView(r1)
            return r9
        L_0x01ca:
            boolean r0 = com.example.restro.MainActivity.super.hasWindowFocus()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x01d4:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.example.restro.MainActivity.super.checkCallingPermission(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x01e2:
            com.example.restro.MainActivity.super.onAttachedToWindow()
            return r9
        L_0x01e6:
            com.example.restro.MainActivity.super.onUserInteraction()
            return r9
        L_0x01ea:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            r7 = r15[r7]
            android.content.BroadcastReceiver r7 = (android.content.BroadcastReceiver) r7
            r6 = r15[r6]
            android.os.Handler r6 = (android.os.Handler) r6
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r3 = r15[r3]
            r10 = r3
            android.os.Bundle r10 = (android.os.Bundle) r10
            r0 = r13
            r3 = r7
            r4 = r6
            r6 = r8
            r7 = r10
            com.example.restro.MainActivity.super.sendOrderedBroadcast(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0215:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.example.restro.MainActivity.super.checkSelfPermission(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0223:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = com.example.restro.MainActivity.super.stopService(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0231:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setProgressBarVisibility(r1)
            return r9
        L_0x023d:
            boolean r0 = com.example.restro.MainActivity.super.onSearchRequested()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0247:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = com.example.restro.MainActivity.super.getSystemService(r1)
            return r0
        L_0x0250:
            r1 = r15[r10]
            android.view.Display r1 = (android.view.Display) r1
            android.content.Context r0 = com.example.restro.MainActivity.super.createDisplayContext(r1)
            return r0
        L_0x0259:
            r1 = r15[r10]
            android.content.IntentSender r1 = (android.content.IntentSender) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            r7 = r4
            android.os.Bundle r7 = (android.os.Bundle) r7
            r0 = r13
            r4 = r6
            r6 = r7
            com.example.restro.MainActivity.super.startIntentSender(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x0285:
            com.example.restro.MainActivity.super.startLockTask()
            return r9
        L_0x0289:
            r1 = r15[r10]
            int[] r1 = (int[]) r1
            android.content.res.TypedArray r0 = com.example.restro.MainActivity.super.obtainStyledAttributes(r1)
            return r0
        L_0x0292:
            int r0 = com.example.restro.MainActivity.super.getChangingConfigurations()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x029c:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            r0 = r13
            r4 = r6
            r6 = r7
            int r0 = com.example.restro.MainActivity.super.checkUriPermission(r1, r2, r3, r4, r5, r6)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x02cd:
            android.app.Application r0 = com.example.restro.MainActivity.super.getApplication()
            return r0
        L_0x02d2:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            r7 = r15[r7]
            android.content.BroadcastReceiver r7 = (android.content.BroadcastReceiver) r7
            r6 = r15[r6]
            android.os.Handler r6 = (android.os.Handler) r6
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r3 = r15[r3]
            r10 = r3
            android.os.Bundle r10 = (android.os.Bundle) r10
            r0 = r13
            r3 = r7
            r4 = r6
            r6 = r8
            r7 = r10
            com.example.restro.MainActivity.super.sendStickyOrderedBroadcastAsUser(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02fd:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setSecondaryProgress(r1)
            return r9
        L_0x0309:
            int r0 = com.example.restro.MainActivity.super.hashCode()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0313:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            boolean r0 = com.example.restro.MainActivity.super.onKeyMultiple(r1, r2, r3)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0331:
            r1 = r15[r10]
            android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
            r8 = r15[r8]
            android.content.IntentSender r8 = (android.content.IntentSender) r8
            r7 = r15[r7]
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6 = r15[r6]
            android.content.Intent r6 = (android.content.Intent) r6
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r10 = r4.intValue()
            r3 = r15[r3]
            java.lang.Number r3 = (java.lang.Number) r3
            int r11 = r3.intValue()
            r2 = r15[r2]
            r12 = r2
            android.os.Bundle r12 = (android.os.Bundle) r12
            r0 = r13
            r2 = r8
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r11
            r8 = r12
            com.example.restro.MainActivity.super.startIntentSenderFromFragment(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x036d:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            r3 = r15[r7]
            android.content.Context r3 = (android.content.Context) r3
            r4 = r15[r6]
            android.util.AttributeSet r4 = (android.util.AttributeSet) r4
            android.view.View r0 = com.example.restro.MainActivity.super.onCreateView(r1, r2, r3, r4)
            return r0
        L_0x0382:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.view.View r0 = com.example.restro.MainActivity.super.onCreatePanelView(r1)
            return r0
        L_0x038f:
            r1 = r15[r10]
            android.view.SearchEvent r1 = (android.view.SearchEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.onSearchRequested(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x039d:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setResult(r1)
            return r9
        L_0x03a9:
            r1 = r15[r10]
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            com.example.restro.MainActivity.super.applyOverrideConfiguration(r1)
            return r9
        L_0x03b1:
            java.io.File r0 = com.example.restro.MainActivity.super.getCacheDir()
            return r0
        L_0x03b6:
            com.example.restro.MainActivity.super.onRestart()
            return r9
        L_0x03ba:
            android.view.WindowManager r0 = com.example.restro.MainActivity.super.getWindowManager()
            return r0
        L_0x03bf:
            com.example.restro.MainActivity.super.onLowMemory()
            return r9
        L_0x03c3:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.onNewIntent(r1)
            return r9
        L_0x03cb:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = com.example.restro.MainActivity.super.navigateUpTo(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x03d9:
            r1 = r15[r10]
            android.support.v7.view.ActionMode r1 = (android.support.v7.view.ActionMode) r1
            com.example.restro.MainActivity.super.onSupportActionModeStarted(r1)
            return r9
        L_0x03e1:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.content.Intent r3 = (android.content.Intent) r3
            com.example.restro.MainActivity.super.onActivityResult(r1, r2, r3)
            return r9
        L_0x03f9:
            r1 = r15[r10]
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchKeyEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0407:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.supportNavigateUpTo(r1)
            return r9
        L_0x040f:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = com.example.restro.MainActivity.super.getFileStreamPath(r1)
            return r0
        L_0x0418:
            java.lang.String r0 = com.example.restro.MainActivity.super.getLocalClassName()
            return r0
        L_0x041d:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setTitleColor(r1)
            return r9
        L_0x0429:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = com.example.restro.MainActivity.super.getDatabasePath(r1)
            return r0
        L_0x0432:
            android.app.ActionBar r0 = com.example.restro.MainActivity.super.getActionBar()
            return r0
        L_0x0437:
            com.example.restro.MainActivity.super.finish()
            return r9
        L_0x043b:
            boolean r0 = com.example.restro.MainActivity.super.isChangingConfigurations()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0445:
            r1 = r15[r10]
            android.content.Intent[] r1 = (android.content.Intent[]) r1
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.example.restro.MainActivity.super.startActivities(r1, r2)
            return r9
        L_0x0451:
            r1 = r15[r10]
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            r2 = r15[r8]
            android.content.IntentFilter r2 = (android.content.IntentFilter) r2
            android.content.Intent r0 = com.example.restro.MainActivity.super.registerReceiver(r1, r2)
            return r0
        L_0x045e:
            android.graphics.drawable.Drawable r0 = com.example.restro.MainActivity.super.peekWallpaper()
            return r0
        L_0x0463:
            boolean r0 = com.example.restro.MainActivity.super.isChild()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x046d:
            r1 = r15[r10]
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            r2 = r15[r8]
            android.content.IntentFilter r2 = (android.content.IntentFilter) r2
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            r4 = r15[r6]
            android.os.Handler r4 = (android.os.Handler) r4
            android.content.Intent r0 = com.example.restro.MainActivity.super.registerReceiver(r1, r2, r3, r4)
            return r0
        L_0x0482:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            boolean r0 = com.example.restro.MainActivity.super.navigateUpToFromChild(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0494:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.io.File r0 = com.example.restro.MainActivity.super.getDir(r1, r2)
            return r0
        L_0x04a5:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.CharSequence r0 = com.example.restro.MainActivity.super.getText(r1)
            return r0
        L_0x04b2:
            android.transition.Scene r0 = com.example.restro.MainActivity.super.getContentScene()
            return r0
        L_0x04b7:
            com.example.restro.MainActivity.super.finishAfterTransition()
            return r9
        L_0x04bb:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            com.example.restro.MainActivity.super.registerForContextMenu(r1)
            return r9
        L_0x04c3:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.app.Dialog r0 = com.example.restro.MainActivity.super.onCreateDialog(r1, r2)
            return r0
        L_0x04d4:
            r1 = r15[r10]
            android.app.assist.AssistContent r1 = (android.app.assist.AssistContent) r1
            com.example.restro.MainActivity.super.onProvideAssistContent(r1)
            return r9
        L_0x04dc:
            r1 = r15[r10]
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.superDispatchKeyEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x04ea:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            com.example.restro.MainActivity.super.enforceCallingOrSelfPermission(r1, r2)
            return r9
        L_0x04f6:
            r1 = r15[r10]
            android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.example.restro.MainActivity.super.startActivityFromFragment(r1, r2, r3, r4)
            return r9
        L_0x050e:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setTheme(r1)
            return r9
        L_0x051a:
            android.content.Intent r0 = com.example.restro.MainActivity.super.getParentActivityIntent()
            return r0
        L_0x051f:
            com.example.restro.MainActivity.super.reportFullyDrawn()
            return r9
        L_0x0523:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.io.FileOutputStream r0 = com.example.restro.MainActivity.super.openFileOutput(r1, r2)
            return r0
        L_0x0534:
            boolean r0 = com.example.restro.MainActivity.super.onNavigateUp()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x053e:
            com.example.restro.MainActivity.super.onDetachedFromWindow()
            return r9
        L_0x0542:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = com.example.restro.MainActivity.super.getColor(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0554:
            android.content.res.Resources r0 = com.example.restro.MainActivity.super.getResources()
            return r0
        L_0x0559:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            r2 = r15[r8]
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            com.example.restro.MainActivity.super.setContentView(r1, r2)
            return r9
        L_0x0565:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.startActivityForResult(r1, r2)
            return r9
        L_0x0575:
            r1 = r15[r10]
            android.support.v4.app.SharedElementCallback r1 = (android.support.v4.app.SharedElementCallback) r1
            com.example.restro.MainActivity.super.setEnterSharedElementCallback(r1)
            return r9
        L_0x057d:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            r2 = r15[r8]
            android.view.Menu r2 = (android.view.Menu) r2
            boolean r0 = com.example.restro.MainActivity.super.onPrepareOptionsPanel(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x058f:
            android.support.v7.app.AppCompatDelegate r0 = com.example.restro.MainActivity.super.getDelegate()
            return r0
        L_0x0594:
            com.example.restro.MainActivity.super.finishAndRemoveTask()
            return r9
        L_0x0598:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            com.example.restro.MainActivity.super.openContextMenu(r1)
            return r9
        L_0x05a0:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setSupportProgressBarIndeterminateVisibility(r1)
            return r9
        L_0x05ac:
            r1 = r15[r10]
            android.database.Cursor r1 = (android.database.Cursor) r1
            com.example.restro.MainActivity.super.startManagingCursor(r1)
            return r9
        L_0x05b4:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.example.restro.MainActivity.super.onProvideAssistData(r1)
            return r9
        L_0x05bc:
            com.example.restro.MainActivity.super.onPause()
            return r9
        L_0x05c0:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = com.example.restro.MainActivity.super.shouldShowRequestPermissionRationale(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x05ce:
            java.lang.String r0 = com.example.restro.MainActivity.super.getPackageResourcePath()
            return r0
        L_0x05d3:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r0 = com.example.restro.MainActivity.super.requestVisibleBehind(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x05e5:
            r1 = r15[r10]
            android.support.v7.view.ActionMode$Callback r1 = (android.support.v7.view.ActionMode.Callback) r1
            android.support.v7.view.ActionMode r0 = com.example.restro.MainActivity.super.startSupportActionMode(r1)
            return r0
        L_0x05ee:
            r1 = r15[r10]
            android.content.IntentSender r1 = (android.content.IntentSender) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = r13
            com.example.restro.MainActivity.super.startIntentSender(r1, r2, r3, r4, r5)
            return r9
        L_0x0613:
            android.content.ContentResolver r0 = com.example.restro.MainActivity.super.getContentResolver()
            return r0
        L_0x0618:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = com.example.restro.MainActivity.super.deleteDatabase(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0626:
            int r0 = com.example.restro.MainActivity.super.getWallpaperDesiredMinimumWidth()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0630:
            boolean r0 = com.example.restro.MainActivity.super.isVoiceInteraction()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x063a:
            java.lang.String[] r0 = com.example.restro.MainActivity.super.databaseList()
            return r0
        L_0x063f:
            int r0 = com.example.restro.MainActivity.super.getRequestedOrientation()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0649:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r0 = com.example.restro.MainActivity.super.checkUriPermission(r1, r2, r3, r4)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x066f:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            r7 = r15[r7]
            java.lang.String r7 = (java.lang.String) r7
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r8 = r4.intValue()
            r3 = r15[r3]
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r0 = r13
            r3 = r7
            r4 = r6
            r6 = r8
            r7 = r10
            com.example.restro.MainActivity.super.enforceUriPermission(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x06a1:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setFinishOnTouchOutside(r1)
            return r9
        L_0x06ad:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.String[] r2 = (java.lang.String[]) r2
            r3 = r15[r7]
            int[] r3 = (int[]) r3
            com.example.restro.MainActivity.super.onRequestPermissionsResult(r1, r2, r3)
            return r9
        L_0x06c1:
            com.example.restro.MainActivity.super.supportPostponeEnterTransition()
            return r9
        L_0x06c5:
            com.example.restro.MainActivity.super.invalidateOptionsMenu()
            return r9
        L_0x06c9:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.sendStickyBroadcast(r1)
            return r9
        L_0x06d1:
            android.view.SearchEvent r0 = com.example.restro.MainActivity.super.getSearchEvent()
            return r0
        L_0x06d6:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            com.example.restro.MainActivity.super.enforceCallingPermission(r1, r2)
            return r9
        L_0x06e2:
            boolean r0 = com.example.restro.MainActivity.super.isFinishing()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x06ec:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = com.example.restro.MainActivity.super.supportRequestWindowFeature(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x06fe:
            r1 = r15[r10]
            android.content.Context r1 = (android.content.Context) r1
            com.example.restro.MainActivity.super.attachBaseContext(r1)
            return r9
        L_0x0706:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            com.example.restro.MainActivity.super.sendBroadcast(r1, r2)
            return r9
        L_0x0712:
            java.lang.String r0 = com.example.restro.MainActivity.super.getPackageCodePath()
            return r0
        L_0x0717:
            java.lang.CharSequence r0 = com.example.restro.MainActivity.super.getTitle()
            return r0
        L_0x071c:
            android.content.pm.PackageManager r0 = com.example.restro.MainActivity.super.getPackageManager()
            return r0
        L_0x0721:
            com.example.restro.MainActivity.super.onResumeFragments()
            return r9
        L_0x0725:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.KeyEvent r2 = (android.view.KeyEvent) r2
            boolean r0 = com.example.restro.MainActivity.super.onKeyShortcut(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x073b:
            com.example.restro.MainActivity.super.finishAffinity()
            return r9
        L_0x073f:
            android.media.session.MediaController r0 = com.example.restro.MainActivity.super.getMediaController()
            return r0
        L_0x0744:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            com.example.restro.MainActivity.super.sendBroadcastAsUser(r1, r2)
            return r9
        L_0x0750:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.example.restro.MainActivity.super.triggerSearch(r1, r2)
            return r9
        L_0x075c:
            int r0 = com.example.restro.MainActivity.super.getTaskId()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0766:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.Menu r2 = (android.view.Menu) r2
            boolean r0 = com.example.restro.MainActivity.super.onMenuOpened(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x077c:
            java.io.File[] r0 = com.example.restro.MainActivity.super.getExternalMediaDirs()
            return r0
        L_0x0781:
            r1 = r15[r10]
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            r3 = r15[r7]
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r0 = com.example.restro.MainActivity.super.startInstrumentation(r1, r2, r3)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0797:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.dismissDialog(r1)
            return r9
        L_0x07a3:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            com.example.restro.MainActivity.super.removeStickyBroadcastAsUser(r1, r2)
            return r9
        L_0x07af:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r0 = com.example.restro.MainActivity.super.getString(r1)
            return r0
        L_0x07bc:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setRequestedOrientation(r1)
            return r9
        L_0x07c8:
            android.support.v7.app.ActionBar r0 = com.example.restro.MainActivity.super.getSupportActionBar()
            return r0
        L_0x07cd:
            android.view.View r0 = com.example.restro.MainActivity.super.getCurrentFocus()
            return r0
        L_0x07d2:
            android.view.MenuInflater r0 = com.example.restro.MainActivity.super.getMenuInflater()
            return r0
        L_0x07d7:
            int r0 = com.example.restro.MainActivity.super.getVolumeControlStream()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x07e1:
            boolean r0 = com.example.restro.MainActivity.super.isDestroyed()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x07eb:
            boolean r0 = com.example.restro.MainActivity.super.isVoiceInteractionRoot()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x07f5:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.app.Dialog r2 = (android.app.Dialog) r2
            r3 = r15[r7]
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.example.restro.MainActivity.super.onPrepareDialog(r1, r2, r3)
            return r9
        L_0x0809:
            android.support.v7.app.ActionBarDrawerToggle$Delegate r0 = com.example.restro.MainActivity.super.getDrawerToggleDelegate()
            return r0
        L_0x080e:
            java.lang.Class r0 = com.example.restro.MainActivity.super.getClass()
            return r0
        L_0x0813:
            r1 = r15[r10]
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r0 = com.example.restro.MainActivity.super.getSystemServiceName(r1)
            return r0
        L_0x081c:
            android.app.Activity r0 = com.example.restro.MainActivity.super.getParent()
            return r0
        L_0x0821:
            com.example.restro.MainActivity.super.onStop()
            return r9
        L_0x0825:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.io.FileDescriptor r2 = (java.io.FileDescriptor) r2
            r3 = r15[r7]
            java.io.PrintWriter r3 = (java.io.PrintWriter) r3
            r4 = r15[r6]
            java.lang.String[] r4 = (java.lang.String[]) r4
            com.example.restro.MainActivity.super.dump(r1, r2, r3, r4)
            return r9
        L_0x0839:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.content.BroadcastReceiver r2 = (android.content.BroadcastReceiver) r2
            r3 = r15[r7]
            android.os.Handler r3 = (android.os.Handler) r3
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.String r5 = (java.lang.String) r5
            r4 = r15[r4]
            r7 = r4
            android.os.Bundle r7 = (android.os.Bundle) r7
            r0 = r13
            r4 = r6
            r6 = r7
            com.example.restro.MainActivity.super.sendStickyOrderedBroadcast(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x085d:
            java.lang.Object r0 = com.example.restro.MainActivity.super.onRetainCustomNonConfigurationInstance()
            return r0
        L_0x0862:
            com.example.restro.MainActivity.super.onBackPressed()
            return r9
        L_0x0866:
            r1 = r15[r10]
            android.app.Fragment r1 = (android.app.Fragment) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            com.example.restro.MainActivity.super.startActivityFromFragment(r1, r2, r3)
            return r9
        L_0x087a:
            r1 = r15[r10]
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            com.example.restro.MainActivity.super.onWindowAttributesChanged(r1)
            return r9
        L_0x0882:
            android.net.Uri r0 = com.example.restro.MainActivity.super.getReferrer()
            return r0
        L_0x0887:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.startActivity(r1)
            return r9
        L_0x088f:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setDefaultKeyMode(r1)
            return r9
        L_0x089b:
            r1 = r15[r10]
            android.util.AttributeSet r1 = (android.util.AttributeSet) r1
            r2 = r15[r8]
            int[] r2 = (int[]) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.content.res.TypedArray r0 = com.example.restro.MainActivity.super.obtainStyledAttributes(r1, r2, r3, r4)
            return r0
        L_0x08b8:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            java.lang.String r4 = (java.lang.String) r4
            com.example.restro.MainActivity.super.enforcePermission(r1, r2, r3, r4)
            return r9
        L_0x08d4:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setSupportProgress(r1)
            return r9
        L_0x08e0:
            r1 = r15[r10]
            android.support.v7.view.ActionMode r1 = (android.support.v7.view.ActionMode) r1
            com.example.restro.MainActivity.super.onSupportActionModeFinished(r1)
            return r9
        L_0x08e8:
            r1 = r15[r10]
            android.app.SharedElementCallback r1 = (android.app.SharedElementCallback) r1
            com.example.restro.MainActivity.super.setExitSharedElementCallback(r1)
            return r9
        L_0x08f0:
            r1 = r15[r10]
            android.content.res.Resources$Theme r1 = (android.content.res.Resources.Theme) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.example.restro.MainActivity.super.onApplyThemeResource(r1, r2, r3)
            return r9
        L_0x0908:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = com.example.restro.MainActivity.super.getExternalFilesDir(r1)
            return r0
        L_0x0911:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            android.content.SharedPreferences r0 = com.example.restro.MainActivity.super.getSharedPreferences(r1, r2)
            return r0
        L_0x0922:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setImmersive(r1)
            return r9
        L_0x092e:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.String r2 = (java.lang.String) r2
            com.example.restro.MainActivity.super.sendOrderedBroadcast(r1, r2)
            return r9
        L_0x093a:
            android.app.LoaderManager r0 = com.example.restro.MainActivity.super.getLoaderManager()
            return r0
        L_0x093f:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            com.example.restro.MainActivity.super.finishFromChild(r1)
            return r9
        L_0x0947:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r0 = com.example.restro.MainActivity.super.startActivityIfNeeded(r1, r2, r3)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0961:
            r1 = r15[r10]
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r0 = com.example.restro.MainActivity.super.onContextItemSelected(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x096f:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setProgressBarIndeterminateVisibility(r1)
            return r9
        L_0x097b:
            r1 = r15[r10]
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.example.restro.MainActivity.super.setWallpaper(r1)
            return r9
        L_0x0983:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.setIntent(r1)
            return r9
        L_0x098b:
            com.example.restro.MainActivity.super.onContentChanged()
            return r9
        L_0x098f:
            android.transition.TransitionManager r0 = com.example.restro.MainActivity.super.getContentTransitionManager()
            return r0
        L_0x0994:
            com.example.restro.MainActivity.super.showLockTaskEscapeMessage()
            return r9
        L_0x0998:
            r1 = r15[r10]
            android.view.ActionMode r1 = (android.view.ActionMode) r1
            com.example.restro.MainActivity.super.onActionModeFinished(r1)
            return r9
        L_0x09a0:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.graphics.drawable.Drawable r0 = com.example.restro.MainActivity.super.getDrawable(r1)
            return r0
        L_0x09ad:
            com.example.restro.MainActivity.super.onSupportContentChanged()
            return r9
        L_0x09b1:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r0 = com.example.restro.MainActivity.super.moveTaskToBack(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x09c3:
            java.lang.Object r0 = com.example.restro.MainActivity.super.onRetainNonConfigurationInstance()
            return r0
        L_0x09c8:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            boolean r0 = com.example.restro.MainActivity.super.startNextMatchingActivity(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x09da:
            r1 = r15[r10]
            android.support.v7.widget.Toolbar r1 = (android.support.v7.widget.Toolbar) r1
            com.example.restro.MainActivity.super.setSupportActionBar(r1)
            return r9
        L_0x09e2:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r0 = com.example.restro.MainActivity.super.checkPermission(r1, r2, r3)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0a00:
            android.net.Uri r0 = com.example.restro.MainActivity.super.onProvideReferrer()
            return r0
        L_0x0a05:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = com.example.restro.MainActivity.super.startNextMatchingActivity(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0a13:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setSupportProgressBarVisibility(r1)
            return r9
        L_0x0a1f:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            boolean r0 = com.example.restro.MainActivity.super.bindService(r1, r2, r3)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0a39:
            r1 = r15[r10]
            android.transition.TransitionManager r1 = (android.transition.TransitionManager) r1
            com.example.restro.MainActivity.super.setContentTransitionManager(r1)
            return r9
        L_0x0a41:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            com.example.restro.MainActivity.super.setFeatureDrawable(r1, r2)
            return r9
        L_0x0a51:
            r1 = r15[r10]
            android.content.ComponentCallbacks r1 = (android.content.ComponentCallbacks) r1
            com.example.restro.MainActivity.super.registerComponentCallbacks(r1)
            return r9
        L_0x0a59:
            java.lang.Object r0 = com.example.restro.MainActivity.super.getLastCustomNonConfigurationInstance()
            return r0
        L_0x0a5e:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.KeyEvent r2 = (android.view.KeyEvent) r2
            boolean r0 = com.example.restro.MainActivity.super.onKeyUp(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0a74:
            r1 = r15[r10]
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2 = r15[r8]
            android.graphics.Canvas r2 = (android.graphics.Canvas) r2
            boolean r0 = com.example.restro.MainActivity.super.onCreateThumbnail(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0a86:
            r1 = r15[r10]
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.example.restro.MainActivity.super.runOnUiThread(r1)
            return r9
        L_0x0a8e:
            r1 = r15[r10]
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            com.example.restro.MainActivity.super.onConfigurationChanged(r1)
            return r9
        L_0x0a96:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = com.example.restro.MainActivity.super.deleteFile(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0aa4:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            android.content.ComponentName r0 = com.example.restro.MainActivity.super.startService(r1)
            return r0
        L_0x0aad:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r8 = r15[r8]
            android.content.IntentSender r8 = (android.content.IntentSender) r8
            r7 = r15[r7]
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6 = r15[r6]
            android.content.Intent r6 = (android.content.Intent) r6
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r10 = r4.intValue()
            r3 = r15[r3]
            java.lang.Number r3 = (java.lang.Number) r3
            int r11 = r3.intValue()
            r2 = r15[r2]
            r12 = r2
            android.os.Bundle r12 = (android.os.Bundle) r12
            r0 = r13
            r2 = r8
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r11
            r8 = r12
            com.example.restro.MainActivity.super.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0ae9:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.io.File[] r0 = com.example.restro.MainActivity.super.getExternalFilesDirs(r1)
            return r0
        L_0x0af2:
            r1 = r15[r10]
            android.content.IntentSender r1 = (android.content.IntentSender) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r7 = r15[r7]
            android.content.Intent r7 = (android.content.Intent) r7
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r8 = r4.intValue()
            r3 = r15[r3]
            r10 = r3
            android.os.Bundle r10 = (android.os.Bundle) r10
            r0 = r13
            r3 = r7
            r4 = r6
            r6 = r8
            r7 = r10
            com.example.restro.MainActivity.super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0b28:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.database.sqlite.SQLiteDatabase$CursorFactory r3 = (android.database.sqlite.SQLiteDatabase.CursorFactory) r3
            android.database.sqlite.SQLiteDatabase r0 = com.example.restro.MainActivity.super.openOrCreateDatabase(r1, r2, r3)
            return r0
        L_0x0b3d:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            android.content.Context r2 = (android.content.Context) r2
            r3 = r15[r7]
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
            android.view.View r0 = com.example.restro.MainActivity.super.onCreateView(r1, r2, r3)
            return r0
        L_0x0b4e:
            r1 = r15[r10]
            android.content.Intent[] r1 = (android.content.Intent[]) r1
            com.example.restro.MainActivity.super.startActivities(r1)
            return r9
        L_0x0b56:
            r1 = r15[r10]
            android.support.v4.app.TaskStackBuilder r1 = (android.support.v4.app.TaskStackBuilder) r1
            com.example.restro.MainActivity.super.onCreateSupportNavigateUpTaskStack(r1)
            return r9
        L_0x0b5e:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.overridePendingTransition(r1, r2)
            return r9
        L_0x0b72:
            android.app.FragmentManager r0 = com.example.restro.MainActivity.super.getFragmentManager()
            return r0
        L_0x0b77:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r15[r8]
            android.os.PersistableBundle r2 = (android.os.PersistableBundle) r2
            com.example.restro.MainActivity.super.onPostCreate(r1, r2)
            return r9
        L_0x0b83:
            r1 = r15[r10]
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.onTitleChanged(r1, r2)
            return r9
        L_0x0b93:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.example.restro.MainActivity.super.onRestoreInstanceState(r1)
            return r9
        L_0x0b9b:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.takeKeyEvents(r1)
            return r9
        L_0x0ba7:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.onGenericMotionEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0bb5:
            r1 = r15[r10]
            android.app.SharedElementCallback r1 = (android.app.SharedElementCallback) r1
            com.example.restro.MainActivity.super.setEnterSharedElementCallback(r1)
            return r9
        L_0x0bbd:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            com.example.restro.MainActivity.super.sendBroadcastAsUser(r1, r2, r3)
            return r9
        L_0x0bcd:
            r1 = r15[r10]
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.requestPermissions(r1, r2)
            return r9
        L_0x0bdd:
            java.io.File r0 = com.example.restro.MainActivity.super.getExternalCacheDir()
            return r0
        L_0x0be2:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.validateRequestPermissionsRequestCode(r1)
            return r9
        L_0x0bee:
            r1 = r15[r10]
            java.lang.Class r1 = (java.lang.Class) r1
            android.support.v4.app.SupportActivity$ExtraData r0 = com.example.restro.MainActivity.super.getExtraData(r1)
            return r0
        L_0x0bf7:
            java.io.File r0 = com.example.restro.MainActivity.super.getObbDir()
            return r0
        L_0x0bfc:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r0 = com.example.restro.MainActivity.super.checkCallingOrSelfUriPermission(r1, r2)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0c12:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r8 = r15[r8]
            android.os.UserHandle r8 = (android.os.UserHandle) r8
            r7 = r15[r7]
            java.lang.String r7 = (java.lang.String) r7
            r6 = r15[r6]
            android.content.BroadcastReceiver r6 = (android.content.BroadcastReceiver) r6
            r5 = r15[r5]
            android.os.Handler r5 = (android.os.Handler) r5
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r10 = r4.intValue()
            r3 = r15[r3]
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r2 = r15[r2]
            r12 = r2
            android.os.Bundle r12 = (android.os.Bundle) r12
            r0 = r13
            r2 = r8
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r11
            r8 = r12
            com.example.restro.MainActivity.super.sendOrderedBroadcastAsUser(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0c43:
            r1 = r15[r10]
            android.content.ServiceConnection r1 = (android.content.ServiceConnection) r1
            com.example.restro.MainActivity.super.unbindService(r1)
            return r9
        L_0x0c4b:
            android.content.pm.ApplicationInfo r0 = com.example.restro.MainActivity.super.getApplicationInfo()
            return r0
        L_0x0c50:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.KeyEvent r2 = (android.view.KeyEvent) r2
            boolean r0 = com.example.restro.MainActivity.super.onKeyLongPress(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0c66:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.example.restro.MainActivity.super.onCreate(r1)
            return r9
        L_0x0c6e:
            r1 = r15[r10]
            android.content.ComponentCallbacks r1 = (android.content.ComponentCallbacks) r1
            com.example.restro.MainActivity.super.unregisterComponentCallbacks(r1)
            return r9
        L_0x0c76:
            r1 = r15[r10]
            android.view.Menu r1 = (android.view.Menu) r1
            com.example.restro.MainActivity.super.onContextMenuClosed(r1)
            return r9
        L_0x0c7e:
            boolean r0 = com.example.restro.MainActivity.super.onSupportNavigateUp()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0c88:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.Menu r2 = (android.view.Menu) r2
            boolean r0 = com.example.restro.MainActivity.super.onCreatePanelMenu(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0c9e:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            com.example.restro.MainActivity.super.startActivityFromChild(r1, r2, r3)
            return r9
        L_0x0cb2:
            r1 = r15[r10]
            android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
            com.example.restro.MainActivity.super.onAttachFragment(r1)
            return r9
        L_0x0cba:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.setFeatureDrawableAlpha(r1, r2)
            return r9
        L_0x0cce:
            java.io.File r0 = com.example.restro.MainActivity.super.getNoBackupFilesDir()
            return r0
        L_0x0cd3:
            r1 = r15[r10]
            android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            com.example.restro.MainActivity.super.startActivityFromFragment(r1, r2, r3)
            return r9
        L_0x0ce7:
            android.content.ComponentName r0 = com.example.restro.MainActivity.super.getComponentName()
            return r0
        L_0x0cec:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            com.example.restro.MainActivity.super.removeStickyBroadcast(r1)
            return r9
        L_0x0cf4:
            r1 = r15[r10]
            android.view.ContextMenu r1 = (android.view.ContextMenu) r1
            r2 = r15[r8]
            android.view.View r2 = (android.view.View) r2
            r3 = r15[r7]
            android.view.ContextMenu$ContextMenuInfo r3 = (android.view.ContextMenu.ContextMenuInfo) r3
            com.example.restro.MainActivity.super.onCreateContextMenu(r1, r2, r3)
            return r9
        L_0x0d04:
            android.support.v4.app.FragmentManager r0 = com.example.restro.MainActivity.super.getSupportFragmentManager()
            return r0
        L_0x0d09:
            com.example.restro.MainActivity.super.onUserLeaveHint()
            return r9
        L_0x0d0d:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.content.SharedPreferences r0 = com.example.restro.MainActivity.super.getPreferences(r1)
            return r0
        L_0x0d1a:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.finishActivity(r1)
            return r9
        L_0x0d26:
            android.content.Intent r0 = com.example.restro.MainActivity.super.getIntent()
            return r0
        L_0x0d2b:
            com.example.restro.MainActivity.super.supportStartPostponedEnterTransition()
            return r9
        L_0x0d2f:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.KeyEvent r2 = (android.view.KeyEvent) r2
            boolean r0 = com.example.restro.MainActivity.super.onKeyDown(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0d45:
            com.example.restro.MainActivity.super.postponeEnterTransition()
            return r9
        L_0x0d49:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r0 = com.example.restro.MainActivity.super.showAssist(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0d57:
            r1 = r15[r10]
            android.app.Fragment r1 = (android.app.Fragment) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.example.restro.MainActivity.super.startActivityFromFragment(r1, r2, r3, r4)
            return r9
        L_0x0d6f:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.onPictureInPictureModeChanged(r1)
            return r9
        L_0x0d7b:
            r1 = r15[r10]
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            android.view.ActionMode r0 = com.example.restro.MainActivity.super.startActionMode(r1)
            return r0
        L_0x0d84:
            r1 = r15[r10]
            android.support.v4.app.SupportActivity$ExtraData r1 = (android.support.v4.app.SupportActivity.ExtraData) r1
            com.example.restro.MainActivity.super.putExtraData(r1)
            return r9
        L_0x0d8c:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.onTrimMemory(r1)
            return r9
        L_0x0d98:
            android.content.Context r0 = com.example.restro.MainActivity.super.getApplicationContext()
            return r0
        L_0x0d9d:
            r1 = r15[r10]
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            android.view.ActionMode r0 = com.example.restro.MainActivity.super.startActionMode(r1, r2)
            return r0
        L_0x0dae:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = com.example.restro.MainActivity.super.requestWindowFeature(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0dc0:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            com.example.restro.MainActivity.super.wait(r1)
            return r9
        L_0x0dcc:
            java.lang.String r0 = com.example.restro.MainActivity.super.getCallingPackage()
            return r0
        L_0x0dd1:
            r1 = r15[r10]
            android.app.ActivityManager$TaskDescription r1 = (android.app.ActivityManager.TaskDescription) r1
            com.example.restro.MainActivity.super.setTaskDescription(r1)
            return r9
        L_0x0dd9:
            r1 = r15[r10]
            android.view.ActionMode r1 = (android.view.ActionMode) r1
            com.example.restro.MainActivity.super.onActionModeStarted(r1)
            return r9
        L_0x0de1:
            r1 = r15[r10]
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            com.example.restro.MainActivity.super.unregisterReceiver(r1)
            return r9
        L_0x0de9:
            r1 = r15[r10]
            android.app.Fragment r1 = (android.app.Fragment) r1
            com.example.restro.MainActivity.super.onAttachFragment(r1)
            return r9
        L_0x0df1:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            java.io.FileInputStream r0 = com.example.restro.MainActivity.super.openFileInput(r1)
            return r0
        L_0x0dfa:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            int[] r2 = (int[]) r2
            android.content.res.TypedArray r0 = com.example.restro.MainActivity.super.obtainStyledAttributes(r1, r2)
            return r0
        L_0x0e0b:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.app.Dialog r2 = (android.app.Dialog) r2
            com.example.restro.MainActivity.super.onPrepareDialog(r1, r2)
            return r9
        L_0x0e1b:
            r1 = r15[r10]
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            android.view.ActionMode r0 = com.example.restro.MainActivity.super.onWindowStartingActionMode(r1)
            return r0
        L_0x0e24:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            android.content.Context r0 = com.example.restro.MainActivity.super.createPackageContext(r1, r2)
            return r0
        L_0x0e35:
            android.view.LayoutInflater r0 = com.example.restro.MainActivity.super.getLayoutInflater()
            return r0
        L_0x0e3a:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            android.content.IntentSender r2 = (android.content.IntentSender) r2
            r7 = r15[r7]
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6 = r15[r6]
            android.content.Intent r6 = (android.content.Intent) r6
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r8 = r4.intValue()
            r3 = r15[r3]
            java.lang.Number r3 = (java.lang.Number) r3
            int r10 = r3.intValue()
            r0 = r13
            r3 = r7
            r4 = r6
            r6 = r8
            r7 = r10
            com.example.restro.MainActivity.super.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0e6f:
            r1 = r15[r10]
            android.view.accessibility.AccessibilityEvent r1 = (android.view.accessibility.AccessibilityEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchPopulateAccessibilityEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0e7d:
            r1 = r15[r10]
            android.support.v7.view.ActionMode$Callback r1 = (android.support.v7.view.ActionMode.Callback) r1
            android.support.v7.view.ActionMode r0 = com.example.restro.MainActivity.super.onWindowStartingSupportActionMode(r1)
            return r0
        L_0x0e86:
            android.app.VoiceInteractor r0 = com.example.restro.MainActivity.super.getVoiceInteractor()
            return r0
        L_0x0e8b:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.app.Dialog r0 = com.example.restro.MainActivity.super.onCreateDialog(r1)
            return r0
        L_0x0e98:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.revokeUriPermission(r1, r2)
            return r9
        L_0x0ea8:
            int r0 = com.example.restro.MainActivity.super.getTitleColor()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0eb2:
            r1 = r15[r10]
            android.support.v4.app.SharedElementCallback r1 = (android.support.v4.app.SharedElementCallback) r1
            com.example.restro.MainActivity.super.setExitSharedElementCallback(r1)
            return r9
        L_0x0eba:
            java.lang.String r0 = com.example.restro.MainActivity.super.getPackageName()
            return r0
        L_0x0ebf:
            android.graphics.drawable.Drawable r0 = com.example.restro.MainActivity.super.getWallpaper()
            return r0
        L_0x0ec4:
            com.example.restro.MainActivity.super.openOptionsMenu()
            return r9
        L_0x0ec8:
            int r0 = com.example.restro.MainActivity.super.getWallpaperDesiredMinimumHeight()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0ed2:
            android.content.Intent r0 = com.example.restro.MainActivity.super.getSupportParentActivityIntent()
            return r0
        L_0x0ed7:
            java.lang.CharSequence r0 = com.example.restro.MainActivity.super.onCreateDescription()
            return r0
        L_0x0edc:
            boolean r0 = com.example.restro.MainActivity.super.isRestricted()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0ee6:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setTitle(r1)
            return r9
        L_0x0ef2:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r0 = com.example.restro.MainActivity.super.checkCallingUriPermission(r1, r2)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0f08:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            boolean r0 = com.example.restro.MainActivity.super.shouldUpRecreateTask(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0f16:
            r1 = r15[r10]
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            android.content.Context r0 = com.example.restro.MainActivity.super.createConfigurationContext(r1)
            return r0
        L_0x0f1f:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.setFeatureDrawableResource(r1, r2)
            return r9
        L_0x0f33:
            java.lang.String[] r0 = com.example.restro.MainActivity.super.fileList()
            return r0
        L_0x0f38:
            r1 = r15[r10]
            android.database.Cursor r1 = (android.database.Cursor) r1
            com.example.restro.MainActivity.super.stopManagingCursor(r1)
            return r9
        L_0x0f40:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            boolean r0 = com.example.restro.MainActivity.super.onMenuItemSelected(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0f56:
            com.example.restro.MainActivity.super.onPostResume()
            return r9
        L_0x0f5a:
            r1 = r15[r10]
            android.app.TaskStackBuilder r1 = (android.app.TaskStackBuilder) r1
            com.example.restro.MainActivity.super.onPrepareNavigateUpTaskStack(r1)
            return r9
        L_0x0f62:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.onTouchEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0f70:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            com.example.restro.MainActivity.super.enforceCallingUriPermission(r1, r2, r3)
            return r9
        L_0x0f84:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r0 = com.example.restro.MainActivity.super.getString(r1, r2)
            return r0
        L_0x0f95:
            java.io.File r0 = com.example.restro.MainActivity.super.getCodeCacheDir()
            return r0
        L_0x0f9a:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            com.example.restro.MainActivity.super.enforceCallingOrSelfUriPermission(r1, r2, r3)
            return r9
        L_0x0fae:
            com.example.restro.MainActivity.super.onDestroy()
            return r9
        L_0x0fb2:
            r1 = r15[r10]
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.onTrackballEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0fc0:
            com.example.restro.MainActivity.super.onResume()
            return r9
        L_0x0fc4:
            r1 = r15[r10]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r15[r8]
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = r15[r7]
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = r15[r6]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.example.restro.MainActivity.super.startSearch(r1, r2, r3, r4)
            return r9
        L_0x0fe0:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            com.example.restro.MainActivity.super.onActivityReenter(r1, r2)
            return r9
        L_0x0ff0:
            boolean r0 = com.example.restro.MainActivity.super.releaseInstance()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x0ffa:
            com.example.restro.MainActivity.super.finalize()
            return r9
        L_0x0ffe:
            java.lang.Object r0 = com.example.restro.MainActivity.super.getLastNonConfigurationInstance()
            return r0
        L_0x1003:
            r1 = r15[r10]
            android.support.v4.app.TaskStackBuilder r1 = (android.support.v4.app.TaskStackBuilder) r1
            com.example.restro.MainActivity.super.onPrepareSupportNavigateUpTaskStack(r1)
            return r9
        L_0x100b:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.net.Uri r2 = (android.net.Uri) r2
            com.example.restro.MainActivity.super.setFeatureDrawableUri(r1, r2)
            return r9
        L_0x101b:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = com.example.restro.MainActivity.super.onNavigateUpFromChild(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x1029:
            r1 = r15[r10]
            android.net.Uri r1 = (android.net.Uri) r1
            r2 = r15[r8]
            java.lang.String[] r2 = (java.lang.String[]) r2
            r3 = r15[r7]
            java.lang.String r3 = (java.lang.String) r3
            r4 = r15[r6]
            java.lang.String[] r4 = (java.lang.String[]) r4
            r5 = r15[r5]
            java.lang.String r5 = (java.lang.String) r5
            r0 = r13
            android.database.Cursor r0 = com.example.restro.MainActivity.super.managedQuery(r1, r2, r3, r4, r5)
            return r0
        L_0x1043:
            r1 = r15[r10]
            android.view.View r1 = (android.view.View) r1
            com.example.restro.MainActivity.super.unregisterForContextMenu(r1)
            return r9
        L_0x104b:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.Menu r2 = (android.view.Menu) r2
            com.example.restro.MainActivity.super.onPanelClosed(r1, r2)
            return r9
        L_0x105b:
            r1 = r15[r10]
            android.content.IntentSender r1 = (android.content.IntentSender) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.content.Intent r3 = (android.content.Intent) r3
            r6 = r15[r6]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5 = r15[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4 = r15[r4]
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            r0 = r13
            r4 = r6
            r6 = r7
            com.example.restro.MainActivity.super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x108a:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r15[r7]
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.example.restro.MainActivity.super.startActivityForResult(r1, r2, r3)
            return r9
        L_0x109e:
            r1 = r15[r10]
            android.view.Menu r1 = (android.view.Menu) r1
            boolean r0 = com.example.restro.MainActivity.super.onCreateOptionsMenu(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x10ac:
            android.content.Context r0 = com.example.restro.MainActivity.super.getBaseContext()
            return r0
        L_0x10b1:
            r1 = r15[r10]
            android.app.TaskStackBuilder r1 = (android.app.TaskStackBuilder) r1
            com.example.restro.MainActivity.super.onCreateNavigateUpTaskStack(r1)
            return r9
        L_0x10b9:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setSupportProgressBarIndeterminate(r1)
            return r9
        L_0x10c5:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.example.restro.MainActivity.super.onChildTitleChanged(r1, r2)
            return r9
        L_0x10d1:
            android.os.Looper r0 = com.example.restro.MainActivity.super.getMainLooper()
            return r0
        L_0x10d6:
            com.example.restro.MainActivity.super.supportFinishAfterTransition()
            return r9
        L_0x10da:
            com.example.restro.MainActivity.super.onStateNotSaved()
            return r9
        L_0x10de:
            r1 = r15[r10]
            android.widget.Toolbar r1 = (android.widget.Toolbar) r1
            com.example.restro.MainActivity.super.setActionBar(r1)
            return r9
        L_0x10e6:
            android.arch.lifecycle.ViewModelStore r0 = com.example.restro.MainActivity.super.getViewModelStore()
            return r0
        L_0x10eb:
            r1 = r15[r10]
            android.media.session.MediaController r1 = (android.media.session.MediaController) r1
            com.example.restro.MainActivity.super.setMediaController(r1)
            return r9
        L_0x10f3:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.onMultiWindowModeChanged(r1)
            return r9
        L_0x10ff:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setProgressBarIndeterminate(r1)
            return r9
        L_0x110b:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r15[r8]
            android.os.PersistableBundle r2 = (android.os.PersistableBundle) r2
            com.example.restro.MainActivity.super.onSaveInstanceState(r1, r2)
            return r9
        L_0x1117:
            com.example.restro.MainActivity.super.closeOptionsMenu()
            return r9
        L_0x111b:
            com.example.restro.MainActivity.super.clearWallpaper()
            return r9
        L_0x111f:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            boolean r0 = com.example.restro.MainActivity.super.showDialog(r1, r2)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x1135:
            boolean r0 = com.example.restro.MainActivity.super.isImmersive()
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x113f:
            r1 = r15[r10]
            android.view.Menu r1 = (android.view.Menu) r1
            boolean r0 = com.example.restro.MainActivity.super.onPrepareOptionsMenu(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x114d:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r15[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.example.restro.MainActivity.super.startActivityFromChild(r1, r2, r3, r4)
            return r9
        L_0x1165:
            android.arch.lifecycle.Lifecycle r0 = com.example.restro.MainActivity.super.getLifecycle()
            return r0
        L_0x116a:
            r1 = r15[r10]
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            android.view.ActionMode r0 = com.example.restro.MainActivity.super.onWindowStartingActionMode(r1, r2)
            return r0
        L_0x117b:
            java.lang.ClassLoader r0 = com.example.restro.MainActivity.super.getClassLoader()
            return r0
        L_0x1180:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            com.example.restro.MainActivity.super.sendStickyBroadcastAsUser(r1, r2)
            return r9
        L_0x118c:
            com.example.restro.MainActivity.super.onVisibleBehindCanceled()
            return r9
        L_0x1190:
            r1 = r15[r10]
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            com.example.restro.MainActivity.super.setWallpaper(r1)
            return r9
        L_0x1198:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.content.res.ColorStateList r0 = com.example.restro.MainActivity.super.getColorStateList(r1)
            return r0
        L_0x11a5:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r15[r8]
            android.os.PersistableBundle r2 = (android.os.PersistableBundle) r2
            com.example.restro.MainActivity.super.onRestoreInstanceState(r1, r2)
            return r9
        L_0x11b1:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.setVolumeControlStream(r1)
            return r9
        L_0x11bd:
            r1 = r15[r10]
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = r15[r8]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            com.example.restro.MainActivity.super.finishActivityFromChild(r1, r2)
            return r9
        L_0x11cd:
            com.example.restro.MainActivity.super.closeContextMenu()
            return r9
        L_0x11d1:
            android.content.ComponentName r0 = com.example.restro.MainActivity.super.getCallingActivity()
            return r0
        L_0x11d6:
            com.example.restro.MainActivity.super.stopLockTask()
            return r9
        L_0x11da:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.content.Intent r2 = (android.content.Intent) r2
            r3 = r15[r7]
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            android.app.PendingIntent r0 = com.example.restro.MainActivity.super.createPendingResult(r1, r2, r3)
            return r0
        L_0x11f3:
            r1 = r15[r10]
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            boolean r0 = com.example.restro.MainActivity.super.dispatchKeyShortcutEvent(r1)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x1201:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.onWindowFocusChanged(r1)
            return r9
        L_0x120d:
            r1 = r15[r10]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.example.restro.MainActivity.super.setVisible(r1)
            return r9
        L_0x1219:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r15[r8]
            android.view.View r2 = (android.view.View) r2
            r3 = r15[r7]
            android.view.Menu r3 = (android.view.Menu) r3
            boolean r0 = com.example.restro.MainActivity.super.onPreparePanel(r1, r2, r3)
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r0)
            return r1
        L_0x1233:
            r1 = r15[r10]
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r15[r8]
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.example.restro.MainActivity.super.startActivity(r1, r2)
            return r9
        L_0x123f:
            r1 = r15[r10]
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = com.example.restro.MainActivity.super.getSystemService(r1)
            return r0
        L_0x1248:
            java.lang.String r0 = com.example.restro.MainActivity.super.toString()
            return r0
        L_0x124d:
            r1 = r15[r10]
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.example.restro.MainActivity.super.showDialog(r1)
            return r9
        L_0x1259:
            r1 = r15[r10]
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.example.restro.MainActivity.super.onSaveInstanceState(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.restro.MainActivity.access$super(com.example.restro.MainActivity, java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    public MainActivity() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/restro/MainActivity;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/restro/MainActivity;[Ljava/lang/Object;)V", objArr2);
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("onCreate.(Landroid/os/Bundle;)V", new Object[]{this, savedInstanceState});
            return;
        }
        MainActivity.super.onCreate(savedInstanceState);
        setContentView(C0005R.layout.activity_main);
    }

    public void start(View view) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("start.(Landroid/view/View;)V", new Object[]{this, view});
            return;
        }
        startActivity(new Intent(this, Start.class));
    }

    public void favourite(View view) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("favourite.(Landroid/view/View;)V", new Object[]{this, view});
            return;
        }
        startActivity(new Intent(this, Fav.class));
    }
}
