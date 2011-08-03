/*
 * Copyright 2000-2011 JetBrains s.r.o.
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

package jetbrains.buildServer.cmakerunner;

import org.jetbrains.annotations.NonNls;

/**
 * @author : Vladislav.Rassokhin
 */
public interface CMakeBuildConstants {
  @NonNls
  String TYPE = "cmake-build";

  @NonNls
  String DESCRIPTION = "Using CMake for build project";
  @NonNls
  String DISPLAY_NAME = "CMake build";

  @NonNls
  String UI_PREFIX = "ui-" + TYPE + "-";

  @NonNls
  String UI_ADDITIONAL_PARAMS = UI_PREFIX + "additional-cmd-params";
  @NonNls
  String UI_NATIVE_TOOL_PARAMS = UI_PREFIX + "native-tool-params";
  @NonNls
  String UI_REDIRECT_STDERR = UI_PREFIX + "redirect-stderr";
  @NonNls
  String UI_MAKEFILE_GENERATOR = UI_PREFIX + "makefile-generator";
  @NonNls
  String UI_DEVELOPER_WARNINGS = UI_PREFIX + "developer-warnings";
  @NonNls
  String UI_BUILD_TARGET = UI_PREFIX + "build-target";

  @NonNls
  String UI_WARN_UNINITIALIZED = UI_PREFIX + "warn-uninitialized";
  @NonNls
  String UI_WARN_UNUSED_VARS = UI_PREFIX + "warn-unused-vars";
  @NonNls
  String UI_NO_WARN_UNUSED_CLI = UI_PREFIX + "no-warn-unused-cli";

  @NonNls
  String UI_PRINT_TRACE = UI_PREFIX + "print-trace";
  @NonNls
  String UI_DEBUG_MODE = UI_PREFIX + "debug-mode";

  @NonNls
  String UI_ADDITIONAL_DEBUG_OPTIONS = UI_PREFIX + "additionalDebugOptions";

  @NonNls
  String UI_CMAKE_COMMAND = UI_PREFIX + "cmake-command";

  @NonNls
  String UI_CMAKE_BUILD_TYPE = UI_PREFIX + "cmake-build-type";

  @NonNls
  String UI_BUILD_CLEAN_FIRST = UI_PREFIX + "clean-before-build";

  @NonNls
  String UI_BUILD_CONFIGURATION = UI_PREFIX + "cmake-build-configuration";

  @NonNls
  String UI_BUILD_PATH = UI_PREFIX + "source-path";

  @NonNls
  String RUNNER_MAKEFILE_GENERATOR = "-G";
  @NonNls
  String RUNNER_DEVELOPER_WARNINGS_ON = "-Wdev";
  @NonNls
  String RUNNER_DEVELOPER_WARNINGS_OFF = "-Wno-dev";

  @NonNls
  String RUNNER_CMAKE_BUILD_TYPE = "CMAKE_BUILD_TYPE";

}
