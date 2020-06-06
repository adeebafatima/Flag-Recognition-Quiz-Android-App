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
            R.drawable.mx,
            "Russia",
            "Mexico",
            "Belgium",
            "Romania",
            2)
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

        val que39=Question(38,
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
            3)
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
            R.drawable.np,
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
            R.drawable.ne,
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
            2)
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







        Collections.shuffle(questionsList)

        val quiz10QuestionsList=ArrayList<Question>()

        for (x in 0 until 10)
            quiz10QuestionsList.add(questionsList.get(x))


        return quiz10QuestionsList
    }

}