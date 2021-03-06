/**
 * Copyright (C) 2016-2019 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.expediagroup.shuntingyard.common.messaging;

import org.apache.hadoop.conf.Configuration;

import com.expediagroup.shuntingyard.common.messaging.MessageReaderFactory;

import com.expedia.apiary.extensions.receiver.common.messaging.MessageReader;

class BogusMessageReaderFactory implements MessageReaderFactory {

  public BogusMessageReaderFactory() {
    throw new RuntimeException("You cannot construct me!");
  }

  @Override
  public MessageReader newInstance(Configuration conf) {
    return null;
  }

}
