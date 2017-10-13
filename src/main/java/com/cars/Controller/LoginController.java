package com.cars.Controller;

import com.cars.VO.JsonResult;
import com.cars.VO.ResultStatusConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
    /**
     * 登录
     *
     * @param userId   用户ID
     * @param password 加密的密码
     * @return
     */
    @RequestMapping(value = "/login/{userId}/{password}", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> login(@PathVariable(value = "userId") String userId,
                                            @PathVariable(value = "password") String password) {
        JsonResult result = new JsonResult();
        try {
            result.setStatus(ResultStatusConstant.OK);
        } catch (Exception e) {
            result.setStatus(ResultStatusConstant.ERROR);
            result.setResult(e.getClass().getName() + ":" + e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }
}
