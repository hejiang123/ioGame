/*
 * ioGame
 * Copyright (C) 2021 - 2023  渔民小镇 （262610965@qq.com、luoyizhu@gmail.com） . All Rights Reserved.
 * # iohao.com . 渔民小镇
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General  License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General  License for more details.
 *
 * You should have received a copy of the GNU General  License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.iohao.game.action.skeleton.core.doc;

import com.iohao.game.action.skeleton.core.ActionCommand;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * action command 文档
 * <pre>
 *     存放源代码信息
 * </pre>
 *
 * @author 渔民小镇
 * @date 2022-01-22
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActionCommandDoc {
    int subCmd;
    ActionCommand actionCommand;

    int classLineNumber = 1;
    String classComment = "";

    /** 代码所在行 */
    int lineNumber = 1;
    String comment = "";

    /** 方法返回值描述 */
    String methodReturnComment = "";
    String methodParamComment = "";
}
