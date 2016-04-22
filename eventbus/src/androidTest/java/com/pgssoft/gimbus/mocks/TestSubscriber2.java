/*
 * Copyright (C) 2016 Arivald
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.pgssoft.gimbus.mocks;

import com.pgssoft.gimbus.EventBus;
import com.pgssoft.gimbus.Subscribe;

public class TestSubscriber2 extends TestSubscriber1 {


    @Subscribe(EventBus.DELIVER_IN_BACKGROUND_THREAD)
    public void onTestEvent2_background(TestEvent2 event) {

    }

    @Subscribe(EventBus.DELIVER_IN_UI_THREAD)
    public void onTestEvent2_ui(TestEvent2 event) {

    }

}
