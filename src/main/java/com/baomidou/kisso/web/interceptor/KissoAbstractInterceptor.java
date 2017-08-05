/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.kisso.web.interceptor;

import com.baomidou.kisso.web.handler.KissoDefaultHandler;
import com.baomidou.kisso.web.handler.SSOHandlerInterceptor;

/**
 * 登录权限验证
 * <p>
 * kisso 拦截器接口
 * </p>
 *
 * @author hubin
 * @since 2015-12-23
 */
public abstract class KissoAbstractInterceptor {

    /* SSO 拦截控制器 */
    private SSOHandlerInterceptor handlerInterceptor;

    public SSOHandlerInterceptor getHandlerInterceptor() {
        if (handlerInterceptor == null) {
            return KissoDefaultHandler.getInstance();
        }
        return handlerInterceptor;
    }

    public void setHandlerInterceptor(SSOHandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }
}