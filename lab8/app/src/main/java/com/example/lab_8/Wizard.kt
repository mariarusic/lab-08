package com.example.lab_8

class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    //this is a wizard class!

    //this function casts a spell
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }
    //this function restores mana
    fun restoreMana(amount: Int) {
        mana = minOf(100, mana + amount)
    }

    //this function increases spell power by 1 and reduces mana by 5
    //as long as we have a minimum mana of 5
    fun train(){
        //only increases if mana>=5, else does nothing
        if(mana >=5){
            mana-=5
            spellPower++
        }
    }
}