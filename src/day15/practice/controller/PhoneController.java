package day15.practice.controller;

import day15.practice.model.vo.GalaxyNote9;
import day15.practice.model.vo.Phone;
import day15.practice.model.vo.SmartPhone;
import day15.practice.model.vo.V40;

public class PhoneController {

    private String[] result = new String[2];

    public String[] method() {

        Phone[] phones = {new GalaxyNote9(), new V40()};

        // since they are both smartphones, you can just check if
        // phones are smartphones, then it will automatically override
        // to the according classes
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) phones[i];
                result[i] = smartPhone.printInformation();
            }
        }

/*        for (int i = 0; i < phones.length; i++) {
            if (phones[i] instanceof GalaxyNote9) {
                GalaxyNote9 gn = (GalaxyNote9) phones[i];
                result[i] = gn.printInformation();
            } else if (phones[i] instanceof V40) {
                V40 v40 = (V40) phones[i];
                result[i] = v40.printInformation();
            }
        }*/

        return result;
    }
}
