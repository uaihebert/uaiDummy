package com.uaihebert.uaidummy.brazil;

import com.uaihebert.uaidummy.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used for Modulo 11 calculations
 * used to calculate verification digits of CPF and CNPJ
 */
class Modulo11 {

    enum TYPE {CPF, CNPJ}

    public static Integer cnpj(final List<Integer> digits, final int multiplier){
        return modulo11(digits, multiplier, TYPE.CNPJ);
    }

    public static Integer cpf(final List<Integer> digits, final int multiplier){
        return modulo11(digits, multiplier, TYPE.CPF);
    }

    private static Integer modulo11(final List<Integer> digits, final int multiplierStart, final TYPE type){
        boolean restarted = false;
        int multiplier = multiplierStart;
        List<Integer> temp = new ArrayList<Integer>(digits);
        for(int i = 0 ; i < temp.size() ; i++){
            temp.set(i, temp.get(i) * multiplier --);

            if(type == TYPE.CNPJ && !restarted && multiplier == 1){
                multiplier = 9;
                restarted = true;
            }

        }
        int sum = ListUtils.sum(temp);
        int rest = sum % 11;
        return rest < 2 ? 0 : (11 - rest);
    }

}
