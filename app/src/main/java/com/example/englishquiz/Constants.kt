package com.example.englishquiz

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Choose the correct form of the verb: I _____ to the store yesterday.",
            arrayListOf("go", "gone", "went", "going"),
            2
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Select the synonym for the word 'happy'.",
            arrayListOf("sad", "joyful", "angry", "bored"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Choose the correct word: She has _____ friends.",
            arrayListOf("much", "many", "a lot", "lots"),
            1
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Identify the correct sentence: ",
            arrayListOf(
                "She don't like apples.",
                "She doesn't likes apples.",
                "She doesn't like apples.",
                "She not like apples."
            ),
            2
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which of the following is a noun?",
            arrayListOf("quickly", "happy", "run", "dog"),
            3
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Choose the correct preposition: He is good _____ math.",
            arrayListOf("at", "on", "in", "with"),
            0
        )
        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Select the correct spelling:",
            arrayListOf("definately", "definitely", "definatly", "definetely"),
            1
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Which word is an adjective?",
            arrayListOf("slowly", "beautiful", "quick", "happily"),
            2
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Choose the correct article: I saw _____ elephant.",
            arrayListOf("a", "an", "the", "none"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Select the correct plural form: child",
            arrayListOf("childs", "childes", "children", "childrens"),
            2
        )
        questionsList.add(questionTen)

        return questionsList
    }
}
