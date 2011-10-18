/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

import java.util.HashMap;
import java.util.Map;

public class Conf extends Collection  {

    public Conf(Service service, String name) {
        super(service, "/services/configs/conf-" + name);
    }

    public Element submit(Map<String,String> args) throws Exception {
        // UNDONE: test to see if this is correct usage
        return super.post(args);
    }

    public Element update(String stanza, Map<String,String>args) throws Exception {
        return super.post("/" + stanza, args);
    }

    public Element delete(String relpath, Map<String,String> args) throws Exception {
        return super.delete("/" + relpath, args);
    }

    public Element delete(String relpath) throws Exception {
        return super.delete("/" + relpath);
    }
}