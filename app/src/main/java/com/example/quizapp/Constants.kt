package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question> ()

        val que1 = Question(1, "What does this figure refer to?",
            R.drawable.ic_java,
            "Java",
            "PHP",
            "JavaScript",
            "KBTG",
            1
        )

        questionsList.add(que1)


        val que2 = Question(
            2, "What does this figure refer to?",
            R.drawable.ic_go,
            "Pandas", "Docker",
            "GO", "Froyo", 3
        )

        questionsList.add(que2)


        val que3 = Question(
            3, "What does this figure refer to?",
            R.drawable.ic_javascript,
            "JSON", "Jesus",
            "Johnson", "JavaScript", 4
        )

        questionsList.add(que3)


        val que4 = Question(
            4, "What does this figure refer to?",
            R.drawable.ic_kotlin,
            "Kubernetes", "Kotlin",
            "Java", "Flutter", 2
        )

        questionsList.add(que4)


        val que5 = Question(
            5, "What does this figure refer to?",
            R.drawable.ic_swift,
            "Objective-C", "Xamarin",
            "Swift", "Xcode", 3
        )

        questionsList.add(que5)


        val que6 = Question(
            6, "What does this figure refer to?",
            R.drawable.ic_nodejs,
            "Node.js", "Vue.js",
            "MongoDB", "Express.js", 1
        )

        questionsList.add(que6)


        val que7 = Question(
            7, "What does this figure refer to?",
            R.drawable.ic_c,
            "C4", "C++",
            "C#", "Civil", 3
        )

        questionsList.add(que7)


        val que8 = Question(
            8, "What does this figure refer to?",
            R.drawable.ic_python,
            "Gopher", "Laravel",
            "Jupyter", "Python", 4
        )

        questionsList.add(que8)


        val que9 = Question(
            9, "What does this figure refer to?",
            R.drawable.ic_flutter,
            "Dart", "Flutter",
            "Tableau", "React Native", 2
        )

        questionsList.add(que9)


        val que10 = Question(
            10, "What does this figure refer to?",
            R.drawable.ic_android,
            "Android", "Chrome",
            "Ubuntu", "Symbian", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}