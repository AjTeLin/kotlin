class Klass {
    companion object {
        val NAME = "Klass"
    }
}

interface Trait {
    companion object {
        const val NAME = "Trait"
    }
}

enum class Enoom {
    ;
    companion object {
        const val NAME = "Enum"
    }
}

fun box() = Test().test()
