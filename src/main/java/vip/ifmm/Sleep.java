package vip.ifmm;

import org.springframework.stereotype.Component;
import vip.ifmm.annotation.Recordlog;

/**
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 * @createTime: 2019/4/2 12:02
 */
@Component
public class Sleep {

    @Recordlog
    public String sleep(String hulu){
        System.out.println(hulu);
        return hulu;
    }
}
