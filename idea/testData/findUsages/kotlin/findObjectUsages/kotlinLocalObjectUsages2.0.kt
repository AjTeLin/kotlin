// PSI_ELEMENT: org.jetbrains.kotlin.psi.JetObjectDeclaration
// OPTIONS: usages
fun foo(): Any {
    if (true) {
        object <caret>Bar

        return Bar
    }

    return Bar
}

val x = Bar
