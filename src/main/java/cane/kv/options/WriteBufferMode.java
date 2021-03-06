/**
 * @(#)WriteBufferMode.java, 2016年11月30日. 
 * 
 * Copyright 2016 zhoukang, Inc. All rights reserved.
 * Use of this source code is governed by the BSD 3-Clause License,
 * that can be found in the LICENSE file.
 */
package cane.kv.options;

/**
 * Buffer持久化到磁盘的策略
 * @author cane
 *
 */
public enum WriteBufferMode {
	WRITEBUFFERMODEDIRECT(0), //每次buffer cache满了，就阻塞住所有的incoming请求，然后直接持久化
	WRITEBUFFERMODEADAPTIVE(1); //每次buffer cache满了，降低incoming的写入速度而不是阻塞
	
	private int type;
        
        private WriteBufferMode(int t) {
            this.type = t;
        }
        
        public int getType() {
            return this.type;
        }

}
