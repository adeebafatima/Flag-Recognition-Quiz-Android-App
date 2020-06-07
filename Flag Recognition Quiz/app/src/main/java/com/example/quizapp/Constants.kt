package com.example.quizapp

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answers"
    const val QUESTION_TEXT:String="What country does this flag belong to ? "


    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val que1=Question(1,
            QUESTION_TEXT,
            R.drawable.cn,
            "Argentina",
            "China",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que1)

        val que2=Question(2,
            QUESTION_TEXT,
            R.drawable.in_,
            "India",
            "Brazil",
            "Australia",
            "Argentina",
            1)
        questionsList.add(que2)

        val que3=Question(3,
            QUESTION_TEXT,
            R.drawable.us,
            "Argentina",
            "Denmark",
            "United States",
            "New Zealand",
            3)
        questionsList.add(que3)

        val que4=Question(4,
            QUESTION_TEXT,
            R.drawable.id,
            "Germany",
            "Indonesia",
            "Belgium",
            "Brazil",
            2)
        questionsList.add(que4)

        val que5=Question(5,
            QUESTION_TEXT,
            R.drawable.br,
            "Brazil",
            "Denmark",
            "Belgium",
            "Fiji",
            1)
        questionsList.add(que5)

        val que6=Question(6,
            QUESTION_TEXT,
            R.drawable.pk,
            "Pakistan",
            "India",
            "Belgium",
            "Fiji",
            1)
        questionsList.add(que6)

        val que7=Question(7,
            QUESTION_TEXT,
            R.drawable.ng,
            "Pakistan",
            "Kuwait",
            "Belgium",
            "Nigeria",
            4)
        questionsList.add(que7)

        val que8=Question(8,
            QUESTION_TEXT,
            R.drawable.bd,
            "Argentina",
            "Bangladesh",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que8)

        val que9=Question(9,
            QUESTION_TEXT,
            R.drawable.kw,
            "Kuwait",
            "New Zealand",
            "Belgium",
            "Denmark",
            1)
        questionsList.add(que9)

        val que10=Question(10,
            QUESTION_TEXT,
            R.drawable.ru,
            "Russia",
            "New Zealand",
            "Belgium",
            "Romania",
            1)
        questionsList.add(que10)

        val que11=Question(11,
            QUESTION_TEXT,
            R.drawable.mh,
            "Russia",
            "Mexico",
            "Marshall Islands",
            "Romania",
            3)
        questionsList.add(que11)

        val que12=Question(12,
            QUESTION_TEXT,
            R.drawable.mx,
            "China",
            "Japan",
            "Mexico",
            "Romania",
            3)
        questionsList.add(que12)


        val que13=Question(13,
            QUESTION_TEXT,
            R.drawable.jp,
            "China",
            "Japan",
            "Mexico",
            "Romania",
            2)
        questionsList.add(que13)

        val que14=Question(14,
            QUESTION_TEXT,
            R.drawable.et,
            "China",
            "Brazil",
            "Mexico",
            "Ethiopia",
            4)
        questionsList.add(que14)

        val que15=Question(15,
            QUESTION_TEXT,
            R.drawable.ph,
            "China",
            "Brazil",
            "Mexico",
            "Philippines",
            4)
        questionsList.add(que15)

        val que16=Question(16,
            QUESTION_TEXT,
            R.drawable.eg,
            "Philippines",
            "Egypt",
            "Mexico",
            "Ethiopia",
            2)
        questionsList.add(que16)

        val que17=Question(17,
            QUESTION_TEXT,
            R.drawable.vn,
            "Philippines",
            "Egypt",
            "Mexico",
            "Vietnam",
            4)
        questionsList.add(que17)

        val que18=Question(18,
            QUESTION_TEXT,
            R.drawable.cd,
            "Philippines",
            "Egypt",
            "Russia",
            "Democratic Republic of the Congo",
            4)
        questionsList.add(que18)

        val que19=Question(19,
            QUESTION_TEXT,
            R.drawable.de,
            "India",
            "Germany",
            "Mexico",
            "Democratic Republic of the Congo",
            2)
        questionsList.add(que19)

        val que20=Question(20,
            QUESTION_TEXT,
            R.drawable.th,
            "India",
            "Germany",
            "Mexico",
            "Thailand",
            4)
        questionsList.add(que20)

        val que21=Question(21,
            QUESTION_TEXT,
            R.drawable.gb,
            "United Kingdom",
            "Germany",
            "Mexico",
            "Thailand",
            1)
        questionsList.add(que21)

        val que22=Question(22,
            QUESTION_TEXT,
            R.drawable.fr,
            "United Kingdom",
            "Germany",
            "Mexico",
            "France",
            4)
        questionsList.add(que22)

        val que23=Question(23,
            QUESTION_TEXT,
            R.drawable.it,
            "United Kingdom",
            "Germany",
            "Italy",
            "France",
            3)
        questionsList.add(que23)

        val que24=Question(24,
            QUESTION_TEXT,
            R.drawable.tz,
            "United Kingdom",
            "Italy",
            "Tanzania",
            "France",
            3)
        questionsList.add(que24)

        val que25=Question(25,
            QUESTION_TEXT,
            R.drawable.za,
            "South Africa",
            "Italy",
            "Tanzania",
            "France",
            1)
        questionsList.add(que25)

        val que26=Question(26,
            QUESTION_TEXT,
            R.drawable.mm,
            "South Africa",
            "Myanmar",
            "Tanzania",
            "France",
            2)
        questionsList.add(que26)

        val que27=Question(27,
            QUESTION_TEXT,
            R.drawable.ke,
            "Kenya",
            "Myanmar",
            "Tanzania",
            "France",
            1)
        questionsList.add(que27)

        val que28=Question(28,
            QUESTION_TEXT,
            R.drawable.co,
            "Kenya",
            "Myanmar",
            "Colombia",
            "France",
            3)
        questionsList.add(que28)

        val que29=Question(29,
            QUESTION_TEXT,
            R.drawable.es,
            "Kenya",
            "Myanmar",
            "South Korea",
            "Spain",
            4)
        questionsList.add(que29)

        val que30=Question(30,
            QUESTION_TEXT,
            R.drawable.ug,
            "Uganda",
            "Myanmar",
            "South Korea",
            "Spain",
            1)
        questionsList.add(que30)

        val que31=Question(31,
            QUESTION_TEXT,
            R.drawable.ar,
            "Russia",
            "Argentina",
            "Belgium",
            "Romania",
            2)
        questionsList.add(que31)

        val que32=Question(32,
            QUESTION_TEXT,
            R.drawable.kr,
            "Russia",
            "South Korea",
            "Belgium",
            "Romania",
            2)
        questionsList.add(que32)

        val que33=Question(33,
            QUESTION_TEXT,
            R.drawable.dz,
            "Algeria",
            "South Korea",
            "Belgium",
            "Romania",
            1)
        questionsList.add(que33)

        val que34=Question(34,
            QUESTION_TEXT,
            R.drawable.sd,
            "Algeria",
            "Sudan",
            "Japan",
            "Belgium",
            2)
        questionsList.add(que34)

        val que35=Question(35,
            QUESTION_TEXT,
            R.drawable.ua,
            "Algeria",
            "Sudan",
            "Japan",
            "Ukraine",
            4)
        questionsList.add(que35)

        val que36=Question(36,
            QUESTION_TEXT,
            R.drawable.af,
            "Algeria",
            "Afghanistan",
            "Iraq",
            "Ukraine",
            2)
        questionsList.add(que36)

        val que37=Question(37,
            QUESTION_TEXT,
            R.drawable.pl,
            "Morocco",
            "Poland",
            "Iraq",
            "Ukraine",
            2)
        questionsList.add(que37)

        val que38=Question(38,
            QUESTION_TEXT,
            R.drawable.ca,
            "Canada",
            "Poland",
            "Iraq",
            "Ukraine",
            1)
        questionsList.add(que38)

        val que39=Question(39,
            QUESTION_TEXT,
            R.drawable.ma,
            "Canada",
            "Poland",
            "Morocco",
            "Ukraine",
            3)
        questionsList.add(que39)

        val que40=Question(40,
            QUESTION_TEXT,
            R.drawable.iq,
            "Canada",
            "Poland",
            "Morocco",
            "Iraq",
            4)
        questionsList.add(que40)

        val que41=Question(41,
            QUESTION_TEXT,
            R.drawable.sa,
            "Saudi Arabia",
            "Algeria",
            "Morocco",
            "Iraq",
            1)
        questionsList.add(que41)

        val que42=Question(42,
            QUESTION_TEXT,
            R.drawable.uz,
            "Saudi Arabia",
            "Algeria",
            "Uzbekistan",
            "Iraq",
            3)
        questionsList.add(que42)

        val que43=Question(43,
            QUESTION_TEXT,
            R.drawable.pe,
            "Saudi Arabia",
            "Algeria",
            "Peru",
            "China",
            3)
        questionsList.add(que43)

        val que44=Question(44,
            QUESTION_TEXT,
            R.drawable.ao,
            "Angola",
            "Japan",
            "Peru",
            "China",
            1)
        questionsList.add(que44)

        val que45=Question(45,
            QUESTION_TEXT,
            R.drawable.my,
            "Angola",
            "Japan",
            "Malaysia",
            "China",
            3)
        questionsList.add(que45)

        val que46=Question(46,
            QUESTION_TEXT,
            R.drawable.mz,
            "Angola",
            "Japan",
            "Malaysia",
            "Mozambique",
            4)
        questionsList.add(que46)



        val que47=Question(47,
            QUESTION_TEXT,
            R.drawable.gh,
            "Ghana",
            "India",
            "Malaysia",
            "Mozambique",
            1)
        questionsList.add(que47)

        val que48=Question(48,
            QUESTION_TEXT,
            R.drawable.ye,
            "Ghana",
            "India",
            "Malaysia",
            "Yemen",
            4)
        questionsList.add(que48)

        val que49=Question(49,
        QUESTION_TEXT,
        R.drawable.np,
        "Ghana",
        "Nepal",
        "Malaysia",
        "Yemen",
        2)
        questionsList.add(que49)

        val que50=Question(50,
            QUESTION_TEXT,
            R.drawable.ve,
            "Ghana",
            "Venezuela",
            "Malaysia",
            "Yemen",
            2)
        questionsList.add(que50)


        val que51=Question(51,
            QUESTION_TEXT,
            R.drawable.mg,
            "Ghana",
            "Venezuela",
            "Malaysia",
            "Madagascar",
            4)
        questionsList.add(que51)

        val que52=Question(52,
            QUESTION_TEXT,
            R.drawable.cm,
            "Cameroon",
            "Venezuela",
            "Japan",
            "Madagascar",
            1)
        questionsList.add(que52)

        val que53=Question(53,
            QUESTION_TEXT,
            R.drawable.ci,
            "Cameroon",
            "Venezuela",
            "Japan",
            "Ivory Coast",
            4)
        questionsList.add(que53)


        val que54=Question(54,
            QUESTION_TEXT,
            R.drawable.kp,
            "Cameroon",
            "South Korea",
            "North Korea",
            "Ivory Coast",
            3)
        questionsList.add(que54)

        val que55=Question(55,
            QUESTION_TEXT,
            R.drawable.au,
            "India",
            "South Korea",
            "Australia",
            "Ivory Coast",
            3)
        questionsList.add(que55)

        val que56=Question(56,
            QUESTION_TEXT,
            R.drawable.ne,
            "Sweden",
            "Niger",
            "Australia",
            "Ivory Coast",
            2)
        questionsList.add(que56)

        val que57=Question(57,
            QUESTION_TEXT,
            R.drawable.lk,
            "Sweden",
            "Sri Lanka",
            "Australia",
            "Pakistan",
            2)
        questionsList.add(que57)

        val que58=Question(58,
            QUESTION_TEXT,
            R.drawable.bf,
            "Burkina Faso",
            "Sri Lanka",
            "Australia",
            "Pakistan",
            1)
        questionsList.add(que58)

        val que59=Question(59,
            QUESTION_TEXT,
            R.drawable.ml,
            "Burkina Faso",
            "Sri Lanka",
            "Australia",
            "Mali",
            4)
        questionsList.add(que59)

        val que60=Question(60,
            QUESTION_TEXT,
            R.drawable.ro,
            "Japan",
            "Mali",
            "Australia",
            "Romania",
            4)
        questionsList.add(que60)

        val que61=Question(61,
            QUESTION_TEXT,
            R.drawable.mw,
            "Philippines",
            "Malawi",
            "Mexico",
            "Vietnam",
            2)
        questionsList.add(que61)

        val que62=Question(62,
            QUESTION_TEXT,
            R.drawable.cl,
            "Chile",
            "Malawi",
            "Mexico",
            "Vietnam",
            1)
        questionsList.add(que62)

        val que63=Question(63,
            QUESTION_TEXT,
            R.drawable.kz,
            "Chile",
            "Malawi",
            "Mexico",
            "Kazakhstan",
            4)
        questionsList.add(que63)


        val que64=Question(64,
            QUESTION_TEXT,
            R.drawable.zm,
            "Zambia",
            "Malawi",
            "Mexico",
            "Kazakhstan",
            1)
        questionsList.add(que64)


        val que65=Question(65,
            QUESTION_TEXT,
            R.drawable.gt,
            "Zambia",
            "Guatemala",
            "Mexico",
            "Kazakhstan",
            2)
        questionsList.add(que65)


        val que66=Question(66,
            QUESTION_TEXT,
            R.drawable.ec,
            "Zambia",
            "Guatemala",
            "Ecuador",
            "Kazakhstan",
            3)
        questionsList.add(que66)


        val que67=Question(67,
            QUESTION_TEXT,
            R.drawable.sy,
            "Indonesia",
            "Guatemala",
            "Syria",
            "Kazakhstan",
            3)
        questionsList.add(que67)


        val que68=Question(68,
            QUESTION_TEXT,
            R.drawable.nl,
            "Indonesia",
            "Guatemala",
            "Netherlands",
            "New Zealand",
            3)
        questionsList.add(que68)

        val que69=Question(69,
            QUESTION_TEXT,
            R.drawable.sn,
            "Morocco",
            "Guatemala",
            "Netherlands",
            "Senegal",
            4)
        questionsList.add(que69)

        val que70=Question(70,
            QUESTION_TEXT,
            R.drawable.kh,
            "Morocco",
            "Guatemala",
            "Cambodia",
            "Senegal",
            3)
        questionsList.add(que70)

        val que71=Question(71,
            QUESTION_TEXT,
            R.drawable.td,
            "Cuba",
            "Chad",
            "Cambodia",
            "Senegal",
            2)
        questionsList.add(que71)

        val que72=Question(72,
            QUESTION_TEXT,
            R.drawable.so,
            "Somalia",
            "Chad",
            "Cambodia",
            "Senegal",
            1)
        questionsList.add(que72)

        val que73=Question(73,
            QUESTION_TEXT,
            R.drawable.zw,
            "Somalia",
            "Zimbabwe",
            "Cambodia",
            "Senegal",
            2)
        questionsList.add(que73)

        val que74=Question(74,
            QUESTION_TEXT,
            R.drawable.gn,
            "Somalia",
            "Zimbabwe",
            "Cambodia",
            "Guinea",
            4)
        questionsList.add(que74)

        val que75=Question(75,
            QUESTION_TEXT,
            R.drawable.rw,
            "Somalia",
            "Rwanda",
            "Cambodia",
            "Guinea",
            2)
        questionsList.add(que75)

        val que76=Question(76,
            QUESTION_TEXT,
            R.drawable.bj,
            "Somalia",
            "Rwanda",
            "Cambodia",
            "Benin",
            4)
        questionsList.add(que76)

        val que77=Question(77,
            QUESTION_TEXT,
            R.drawable.bi,
            "Russia",
            "Cuba",
            "Belgium",
            "Burundi",
            4)
        questionsList.add(que77)

        val que78=Question(78,
            QUESTION_TEXT,
            R.drawable.tn,
            "Tunisia",
            "Cuba",
            "Belgium",
            "Burundi",
            1)
        questionsList.add(que78)

        val que79=Question(79,
            QUESTION_TEXT,
            R.drawable.bo,
            "Bolivia",
            "Cuba",
            "Belgium",
            "Burundi",
            1)
        questionsList.add(que79)

        val que80=Question(80,
            QUESTION_TEXT,
            R.drawable.be,
            "Bolivia",
            "Cuba",
            "Belgium",
            "Burundi",
            3)
        questionsList.add(que80)

        val que81=Question(81,
            QUESTION_TEXT,
            R.drawable.ht,
            "Argentina",
            "Haiti",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que81)

        val que82=Question(82,
            QUESTION_TEXT,
            R.drawable.cu,
            "Cuba",
            "Brazil",
            "Australia",
            "Argentina",
            1)
        questionsList.add(que82)

        val que83=Question(83,
            QUESTION_TEXT,
            R.drawable.ss,
            "Argentina",
            "Denmark",
            "South Sudan",
            "New Zealand",
            3)
        questionsList.add(que83)

        val que84=Question(84,
            QUESTION_TEXT,
            R.drawable.do_,
            "Germany",
            "Dominican Republic",
            "Belgium",
            "Czech Republic",
            2)
        questionsList.add(que84)

        val que85=Question(85,
            QUESTION_TEXT,
            R.drawable.cz,
            "Czech Republic",
            "Denmark",
            "Belgium",
            "Dominican Republic",
            1)
        questionsList.add(que85)

        val que86=Question(86,
            QUESTION_TEXT,
            R.drawable.gr,
            "Greece",
            "India",
            "Belgium",
            "Jordan",
            1)
        questionsList.add(que86)

        val que87=Question(87,
            QUESTION_TEXT,
            R.drawable.jo,
            "Pakistan",
            "Kuwait",
            "Belgium",
            "Jordan",
            4)
        questionsList.add(que87)

        val que88=Question(88,
            QUESTION_TEXT,
            R.drawable.pt,
            "Argentina",
            "Portugal",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que88)

        val que89=Question(89,
            QUESTION_TEXT,
            R.drawable.az,
            "Azerbaijan",
            "New Zealand",
            "Belgium",
            "Denmark",
            1)
        questionsList.add(que89)

        val que90=Question(90,
            QUESTION_TEXT,
            R.drawable.se,
            "Sweden",
            "New Zealand",
            "Belgium",
            "Romania",
            1)
        questionsList.add(que90)

        val que91=Question(91,
            QUESTION_TEXT,
            R.drawable.hn,
            "Russia",
            "Honduras",
            "Belgium",
            "Romania",
            2)
        questionsList.add(que91)

        val que92=Question(92,
            QUESTION_TEXT,
            R.drawable.ae,
            "Russia",
            "United Arab Emirates",
            "Belgium",
            "Pakistan",
            2)
        questionsList.add(que92)

        val que93=Question(93,
            QUESTION_TEXT,
            R.drawable.hu,
            "Hungary",
            "South Korea",
            "Belgium",
            "Romania",
            1)
        questionsList.add(que93)

        val que94=Question(94,
            QUESTION_TEXT,
            R.drawable.tj,
            "Algeria",
            "Tajikistan",
            "Japan",
            "Belgium",
            2)
        questionsList.add(que94)

        val que95=Question(95,
            QUESTION_TEXT,
            R.drawable.by,
            "Algeria",
            "Sudan",
            "Japan",
            "Belarus",
            4)
        questionsList.add(que95)

        val que96=Question(96,
            QUESTION_TEXT,
            R.drawable.at,
            "Algeria",
            "Austria",
            "Papua New Guinea",
            "Ukraine",
            2)
        questionsList.add(que96)

        val que97=Question(97,
            QUESTION_TEXT,
            R.drawable.pg,
            "Morocco",
            "Papua New Guinea",
            "Iraq",
            "Ukraine",
            2)
        questionsList.add(que97)

        val que98=Question(98,
            QUESTION_TEXT,
            R.drawable.ch,
            "Canada",
            "Poland",
            "Switzerland",
            "Ukraine",
            3)
        questionsList.add(que98)

        val que99=Question(99,
            QUESTION_TEXT,
            R.drawable.rs,
            "Canada",
            "Poland",
            "Serbia",
            "Ukraine",
            3)
        questionsList.add(que99)

        val que100=Question(100,
            QUESTION_TEXT,
            R.drawable.il,
            "Israel",
            "Poland",
            "Morocco",
            "Iraq",
            1)
        questionsList.add(que100)

        val que101=Question(101,
            QUESTION_TEXT,
            R.drawable.tg,
            "Philippines",
            "Togo",
            "Mexico",
            "Vietnam",
            2)
        questionsList.add(que101)

        val que102=Question(102,
            QUESTION_TEXT,
            R.drawable.sl,
            "Sierra Leone",
            "Malawi",
            "Mexico",
            "Vietnam",
            1)
        questionsList.add(que102)

        val que103=Question(103,
            QUESTION_TEXT,
            R.drawable.tr,
            "Chile",
            "Malawi",
            "Mexico",
            "Turkey",
            4)
        questionsList.add(que103)


        val que104=Question(104,
            QUESTION_TEXT,
            R.drawable.la,
            "Laos",
            "Malawi",
            "Mexico",
            "Kazakhstan",
            1)
        questionsList.add(que104)


        val que105=Question(105,
            QUESTION_TEXT,
            R.drawable.kg,
            "Zambia",
            "Kyrgyzstan",
            "Mexico",
            "Kazakhstan",
            2)
        questionsList.add(que105)


        val que106=Question(106,
            QUESTION_TEXT,
            R.drawable.py,
            "Zambia",
            "Guatemala",
            "Paraguay",
            "Kazakhstan",
            3)
        questionsList.add(que106)


        val que107=Question(107,
            QUESTION_TEXT,
            R.drawable.bg,
            "Indonesia",
            "Guatemala",
            "Bulgaria",
            "Kazakhstan",
            3)
        questionsList.add(que107)


        val que108=Question(108,
            QUESTION_TEXT,
            R.drawable.ly,
            "Indonesia",
            "Guatemala",
            "Libya",
            "New Zealand",
            3)
        questionsList.add(que108)

        val que109=Question(109,
            QUESTION_TEXT,
            R.drawable.lb,
            "Morocco",
            "Guatemala",
            "Netherlands",
            "Lebanon",
            4)
        questionsList.add(que109)

        val que110=Question(110,
            QUESTION_TEXT,
            R.drawable.ni,
            "Morocco",
            "Guatemala",
            "Nicaragua",
            "Senegal",
            3)
        questionsList.add(que110)



        val que111=Question(111,
            QUESTION_TEXT,
            R.drawable.sv,
            "Argentina",
            "El Salvador",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que111)

        val que112=Question(112,
            QUESTION_TEXT,
            R.drawable.tm,
            "Turkmenistan",
            "Brazil",
            "Australia",
            "Argentina",
            1)
        questionsList.add(que112)

        val que113=Question(113,
            QUESTION_TEXT,
            R.drawable.sg,
            "Turkmenistan",
            "Denmark",
            "Singapore",
            "El Salvador",
            3)
        questionsList.add(que113)

        val que114=Question(114,
            QUESTION_TEXT,
            R.drawable.dk,
            "Germany",
            "Denmark",
            "Belgium",
            "El Salvador",
            2)
        questionsList.add(que114)

        val que115=Question(115,
            QUESTION_TEXT,
            R.drawable.fi,
            "Finland",
            "Denmark",
            "Belgium",
            "Dominican Republic",
            1)
        questionsList.add(que115)

        val que116=Question(116,
            QUESTION_TEXT,
            R.drawable.cg,
            "Greece",
            "Republic of the Congo",
            "Belgium",
            "Jordan",
            2)
        questionsList.add(que116)

        val que117=Question(117,
            QUESTION_TEXT,
            R.drawable.sk,
            "Pakistan",
            "Kuwait",
            "Belgium",
            "Slovakia",
            4)
        questionsList.add(que117)

        val que118=Question(118,
            QUESTION_TEXT,
            R.drawable.no,
            "Slovakia",
            "Norway",
            "Belgium",
            "Fiji",
            2)
        questionsList.add(que118)

        val que119=Question(119,
            QUESTION_TEXT,
            R.drawable.om,
            "Oman",
            "Turkmenistan",
            "Belgium",
            "Singapore",
            1)
        questionsList.add(que119)

        val que120=Question(120,
            QUESTION_TEXT,
            R.drawable.to,
            "Sweden",
            "Turkmenistan",
            "Tonga",
            "Singapore",
            3)
        questionsList.add(que120)

        val que121=Question(121,
            QUESTION_TEXT,
            R.drawable.cr,
            "Costa Rica",
            "Algeria",
            "Morocco",
            "Iraq",
            1)
        questionsList.add(que121)

        val que122=Question(122,
            QUESTION_TEXT,
            R.drawable.lr,
            "Saudi Arabia",
            "Algeria",
            "Liberia",
            "Iraq",
            3)
        questionsList.add(que122)

        val que123=Question(123,
            QUESTION_TEXT,
            R.drawable.ie,
            "Liberia",
            "Algeria",
            "Ireland",
            "China",
            3)
        questionsList.add(que123)

        val que124=Question(124,
            QUESTION_TEXT,
            R.drawable.cf,
            "Central African Republic",
            "Japan",
            "Peru",
            "Ireland",
            1)
        questionsList.add(que124)

        val que125=Question(125,
            QUESTION_TEXT,
            R.drawable.nz,
            "Angola",
            "Japan",
            "New Zealand",
            "China",
            3)
        questionsList.add(que125)

        val que126=Question(126,
            QUESTION_TEXT,
            R.drawable.mr,
            "Angola",
            "Japan",
            "Mauritania",
            "Mozambique",
            3)
        questionsList.add(que126)



        val que127=Question(127,
            QUESTION_TEXT,
            R.drawable.pa,
            "Panama",
            "India",
            "Malaysia",
            "Ireland",
            1)
        questionsList.add(que127)

        val que128=Question(128,
            QUESTION_TEXT,
            R.drawable.tv,
            "Kuwait",
            "Tuvalu",
            "Malaysia",
            "Yemen",
            2)
        questionsList.add(que128)

        val que129=Question(129,
            QUESTION_TEXT,
            R.drawable.hr,
            "Ghana",
            "Croatia",
            "Malaysia",
            "Moldova",
            2)
        questionsList.add(que129)

        val que130=Question(130,
            QUESTION_TEXT,
            R.drawable.md,
            "Ghana",
            "Moldova",
            "Ireland",
            "Yemen",
            2)
        questionsList.add(que130)

        val que131=Question(131,
            QUESTION_TEXT,
            R.drawable.ge,
            "Georgia",
            "Panama",
            "Morocco",
            "Iraq",
            1)
        questionsList.add(que131)

        val que132=Question(132,
            QUESTION_TEXT,
            R.drawable.er,
            "Saudi Arabia",
            "Algeria",
            "Eritrea",
            "Iraq",
            3)
        questionsList.add(que132)

        val que133=Question(133,
            QUESTION_TEXT,
            R.drawable.uy,
            "Liberia",
            "Panama",
            "Uruguay",
            "Costa Rica",
            3)
        questionsList.add(que133)

        val que134=Question(134,
            QUESTION_TEXT,
            R.drawable.ba,
            "Central African Republic",
            "Japan",
            "Peru",
            "Bosnia and Herzegovina",
            4)
        questionsList.add(que134)

        val que135=Question(135,
            QUESTION_TEXT,
            R.drawable.mn,
            "Mongolia",
            "Bosnia and Herzegovina",
            "New Zealand",
            "China",
            1)
        questionsList.add(que135)

        val que136=Question(136,
            QUESTION_TEXT,
            R.drawable.am,
            "Angola",
            "Japan",
            "Armenia",
            "Mozambique",
            3)
        questionsList.add(que136)



        val que137=Question(137,
            QUESTION_TEXT,
            R.drawable.jm,
            "Panama",
            "India",
            "Jamaica",
            "Ireland",
            3)
        questionsList.add(que137)

        val que138=Question(138,
            QUESTION_TEXT,
            R.drawable.qa,
            "Kuwait",
            "India",
            "Malaysia",
            "Qatar",
            4)
        questionsList.add(que138)


        val que139=Question(139,
            QUESTION_TEXT,
            R.drawable.tw,
            "Taiwan",
            "Croatia",
            "Peru",
            "Moldova",
            1)
        questionsList.add(que139)

        val que140=Question(140,
            QUESTION_TEXT,
            R.drawable.al,
            "Ghana",
            "Peru",
            "Albania",
            "Yemen",
            3)
        questionsList.add(que140)

        val que141=Question(141,
            QUESTION_TEXT,
            R.drawable.lt,
            "Lithuania",
            "Togo",
            "Mexico",
            "Vietnam",
            1)
        questionsList.add(que141)

        val que142=Question(142,
            QUESTION_TEXT,
            R.drawable.na,
            "Sierra Leone",
            "Namibia",
            "Mexico",
            "Vietnam",
            2)
        questionsList.add(que142)

        val que143=Question(143,
            QUESTION_TEXT,
            R.drawable.gm,
            "Chile",
            "Malawi",
            "Gambia",
            "Hong Kong",
            3)
        questionsList.add(que143)


        val que144=Question(144,
            QUESTION_TEXT,
            R.drawable.bw,
            "Laos",
            "Malawi",
            "Mexico",
            "Botswana",
            4)
        questionsList.add(que144)


        val que145=Question(145,
            QUESTION_TEXT,
            R.drawable.ga,
            "Gabon",
            "Kyrgyzstan",
            "Mexico",
            "Kazakhstan",
            1)
        questionsList.add(que145)


        val que146=Question(146,
            QUESTION_TEXT,
            R.drawable.ls,
            "Zambia",
            "Lesotho",
            "Paraguay",
            "Kazakhstan",
            2)
        questionsList.add(que146)


        val que147=Question(147,
            QUESTION_TEXT,
            R.drawable.si,
            "Indonesia",
            "Guatemala",
            "Slovenia",
            "Kazakhstan",
            3)
        questionsList.add(que147)


        val que148=Question(148,
            QUESTION_TEXT,
            R.drawable.mk,
            "Indonesia",
            "Guatemala",
            "Libya",
            "North Macedonia",
            4)
        questionsList.add(que148)

        val que149=Question(149,
            QUESTION_TEXT,
            R.drawable.lv,
            "Latvia",
            "Guatemala",
            "Netherlands",
            "Lebanon",
            1)
        questionsList.add(que149)

        val que150=Question(150,
            QUESTION_TEXT,
            R.drawable.bh,
            "Morocco",
            "Guatemala",
            "Nicaragua",
            "Bahrain",
            4)
        questionsList.add(que150)

        val que151=Question(151,
            QUESTION_TEXT,
            R.drawable.ad,
            "Lithuania",
            "Togo",
            "Mexico",
            "Andorra",
            4)
        questionsList.add(que151)

        val que152=Question(152,
            QUESTION_TEXT,
            R.drawable.ag,
            "Sierra Leone",
            "Namibia",
            "Trinidad and Tobago",
            "Antigua and Barbuda",
            4)
        questionsList.add(que152)

        val que153=Question(153,
            QUESTION_TEXT,
            R.drawable.bb,
            "Chile",
            "Barbados",
            "Gambia",
            "Hong Kong",
            2)
        questionsList.add(que153)


        val que154=Question(154,
            QUESTION_TEXT,
            R.drawable.tl,
            "Timor-Leste",
            "Dominica",
            "Mexico",
            "Botswana",
            2)
        questionsList.add(que154)


        val que155=Question(155,
            QUESTION_TEXT,
            R.drawable.gd,
            "Gabon",
            "Kyrgyzstan",
            "Mexico",
            "Grenada",
            4)
        questionsList.add(que155)


        val que156=Question(156,
            QUESTION_TEXT,
            R.drawable.gw,
            "Zambia",
            "Lesotho",
            "Guinea-Bissau",
            "Kazakhstan",
            3)
        questionsList.add(que156)


        val que157=Question(157,
            QUESTION_TEXT,
            R.drawable.ir,
            "Indonesia",
            "Iran",
            "Slovenia",
            "Kazakhstan",
            2)
        questionsList.add(que157)


        val que158=Question(158,
            QUESTION_TEXT,
            R.drawable.ki,
            "Kiribati",
            "Guatemala",
            "Libya",
            "North Macedonia",
            1)
        questionsList.add(que158)

        val que159=Question(159,
            QUESTION_TEXT,
            R.drawable.xk,
            "Kosovo",
            "Guatemala",
            "Netherlands",
            "Lebanon",
            1)
        questionsList.add(que159)

        val que160=Question(160,
            QUESTION_TEXT,
            R.drawable.li,
            "Morocco",
            "Guatemala",
            "Nicaragua",
            "Liechtenstein",
            4)
        questionsList.add(que160)


        val que161=Question(161,
            QUESTION_TEXT,
            R.drawable.gq,
            "Lithuania",
            "Togo",
            "Mexico",
            "Equatorial Guinea",
            4)
        questionsList.add(que161)

        val que162=Question(162,
            QUESTION_TEXT,
            R.drawable.tt,
            "Sierra Leone",
            "Namibia",
            "Trinidad and Tobago",
            "Vietnam",
            3)
        questionsList.add(que162)

        val que163=Question(163,
            QUESTION_TEXT,
            R.drawable.ee,
            "Chile",
            "Estonia",
            "Gambia",
            "Hong Kong",
            2)
        questionsList.add(que163)


        val que164=Question(164,
            QUESTION_TEXT,
            R.drawable.tl,
            "Timor-Leste",
            "Malawi",
            "Mexico",
            "Botswana",
            1)
        questionsList.add(que164)


        val que165=Question(165,
            QUESTION_TEXT,
            R.drawable.mu,
            "Gabon",
            "Kyrgyzstan",
            "Mexico",
            "Mauritius",
            4)
        questionsList.add(que165)


        val que166=Question(166,
            QUESTION_TEXT,
            R.drawable.cy,
            "Zambia",
            "Lesotho",
            "Cyprus",
            "Kazakhstan",
            3)
        questionsList.add(que166)


        val que167=Question(167,
            QUESTION_TEXT,
            R.drawable.sz,
            "Indonesia",
            "Eswatini",
            "Slovenia",
            "Kazakhstan",
            2)
        questionsList.add(que167)


        val que168=Question(168,
            QUESTION_TEXT,
            R.drawable.dj,
            "Djibouti",
            "Guatemala",
            "Libya",
            "North Macedonia",
            1)
        questionsList.add(que168)

        val que169=Question(169,
            QUESTION_TEXT,
            R.drawable.fj,
            "Fiji",
            "Guatemala",
            "Netherlands",
            "Lebanon",
            1)
        questionsList.add(que169)

        val que170=Question(170,
            QUESTION_TEXT,
            R.drawable.nr,
            "Morocco",
            "Guatemala",
            "Nicaragua",
            "Nauru",
            4)
        questionsList.add(que170)



        val que171=Question(171,
            QUESTION_TEXT,
            R.drawable.gy,
            "Russia",
            "Honduras",
            "Guyana",
            "Romania",
            3)
        questionsList.add(que171)

        val que172=Question(172,
            QUESTION_TEXT,
            R.drawable.bt,
            "Russia",
            "United Arab Emirates",
            "Belgium",
            "Bhutan",
            4)
        questionsList.add(que172)

        val que173=Question(173,
            QUESTION_TEXT,
            R.drawable.sb,
            "Hungary",
            "South Korea",
            "Solomon Islands",
            "Romania",
            3)
        questionsList.add(que173)

        val que174=Question(174,
            QUESTION_TEXT,
            R.drawable.pw,
            "Algeria",
            "Palau",
            "Japan",
            "Belgium",
            2)
        questionsList.add(que174)

        val que175=Question(175,
            QUESTION_TEXT,
            R.drawable.me,
            "Algeria",
            "Sudan",
            "Japan",
            "Montenegro",
            4)
        questionsList.add(que175)

        val que176=Question(176,
            QUESTION_TEXT,
            R.drawable.lu,
            "Algeria",
            "Luxembourg",
            "Papua New Guinea",
            "Ukraine",
            2)
        questionsList.add(que176)

        val que177=Question(177,
            QUESTION_TEXT,
            R.drawable.km,
            "Morocco",
            "Papua New Guinea",
            "Comoros",
            "Ukraine",
            3)
        questionsList.add(que177)

        val que178=Question(178,
            QUESTION_TEXT,
            R.drawable.kn,
            "Canada",
            "Poland",
            "Saint Kitts and Nevis",
            "Ukraine",
            3)
        questionsList.add(que178)

        val que179=Question(179,
            QUESTION_TEXT,
            R.drawable.sr,
            "Canada",
            "Poland",
            "Suriname",
            "Ukraine",
            3)
        questionsList.add(que179)

        val que180=Question(180,
            QUESTION_TEXT,
            R.drawable.cv,
            "Cabo Verde",
            "Poland",
            "Morocco",
            "Iraq",
            1)
        questionsList.add(que180)



        val que181=Question(181,
            QUESTION_TEXT,
            R.drawable.mv,
            "Maldives",
            "Honduras",
            "Guyana",
            "Romania",
            1)
        questionsList.add(que181)

        val que182=Question(182,
            QUESTION_TEXT,
            R.drawable.mt,
            "Malta",
            "United Arab Emirates",
            "Belgium",
            "Bhutan",
            1)
        questionsList.add(que182)

        val que183=Question(183,
            QUESTION_TEXT,
            R.drawable.bn,
            "Hungary",
            "South Korea",
            "Solomon Islands",
            "Brunei",
            4)
        questionsList.add(que183)


        val que184=Question(184,
            QUESTION_TEXT,
            R.drawable.lc,
            "Saint Lucia",
            "Macao",
            "Japan",
            "Belgium",
            1)
        questionsList.add(que184)

        val que185=Question(185,
            QUESTION_TEXT,
            R.drawable.bz,
            "Algeria",
            "Sudan",
            "Japan",
            "Belize",
            4)
        questionsList.add(que185)

        val que186=Question(186,
            QUESTION_TEXT,
            R.drawable.bs,
            "Algeria",
            "Bahamas",
            "Papua New Guinea",
            "Ukraine",
            2)
        questionsList.add(que186)

        val que187=Question(187,
            QUESTION_TEXT,
            R.drawable.vc,
            "Morocco",
            "Papua New Guinea",
            "Saint Vincent and the Grenadines",
            "Ukraine",
            3)
        questionsList.add(que187)

        val que188=Question(188,
            QUESTION_TEXT,
            R.drawable.is_,
            "Iceland",
            "Poland",
            "Western Sahara",
            "Ukraine",
            1)
        questionsList.add(que188)

        val que189=Question(189,
            QUESTION_TEXT,
            R.drawable.vu,
            "Canada",
            "Vanuatu",
            "Suriname",
            "Ukraine",
            2)
        questionsList.add(que189)

        val que190=Question(190,
            QUESTION_TEXT,
            R.drawable.ws,
            "Cabo Verde",
            "Poland",
            "Morocco",
            "Samoa",
            4)
        questionsList.add(que190)

        val que191=Question(191,
            QUESTION_TEXT,
            R.drawable.sm,
            "Cabo Verde",
            "San Marino",
            "Morocco",
            "Japan",
            2)
        questionsList.add(que191)

        val que192=Question(192,
            QUESTION_TEXT,
            R.drawable.st,
            "Cabo Verde",
            "Manaco",
            "Sao Tome and Principe",
            "Palau",
            3)
        questionsList.add(que192)


        val que193=Question(193,
            QUESTION_TEXT,
            R.drawable.sc,
            "Cabo Verde",
            "Iran",
            "Kosovo",
            "Seychelles",
            4)
        questionsList.add(que193)

        val que194=Question(194,
            QUESTION_TEXT,
            R.drawable.va,
            "Cabo Verde",
            "Andorra",
            "Barbados",
            "Vatican",
            4)
        questionsList.add(que194)

        val que195=Question(195,
            QUESTION_TEXT,
            R.drawable.mc,
            "Vanuatu",
            "Dominica",
            "Turkey",
            "Monaco",
            4)
        questionsList.add(que195)

        val que196=Question(196,
            QUESTION_TEXT,
            R.drawable.fm,
            "Micronesia",
            "Dominica",
            "Turkey",
            "Monaco",
            1)
        questionsList.add(que196)


















        Collections.shuffle(questionsList)

        val quiz10QuestionsList=ArrayList<Question>()

        for (x in 0 until 10)
            quiz10QuestionsList.add(questionsList.get(x))


        return quiz10QuestionsList
    }

}