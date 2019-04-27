/*
 * Copyright (c) 2019, guanquan.wang@yandex.com All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ttzero.excel.entity;

/**
 * A row block has const 32 rows.
 * Create by guanquan.wang at 2019-04-23 08:50
 */
public class RowBlock {
    private Row[] rows;
    private int i, n, total = 0;
    private boolean eof;

    /**
     * Clear index mark
     */
    final RowBlock clear() {
        i = n = 0;
        return this;
    }

    /**
     * Total rows of a worksheet
     * @return the total rows
     */
    public int getTotal() {
        return total;
    }

    /**
     * End of file mark
     */
    void markEnd() {
        eof = true;
    }

    /**
     * End of file mark
     * @return true if end of file
     */
    public boolean isEof() {
        return eof;
    }

    final RowBlock flip() {
        i = 0;
        return this;
    }
}
