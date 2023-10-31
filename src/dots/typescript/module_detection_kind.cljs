(ns dots.typescript.module-detection-kind
  (:refer-clojure :exclude [force])
  (:require ["typescript" :as typescript]))

(def legacy
  "Files with imports, exports and/or import.meta are considered modules"
  (.-Legacy typescript/ModuleDetectionKind))

(def auto
  "Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+"
  (.-Auto typescript/ModuleDetectionKind))

(def force
  "Consider all non-declaration files modules, regardless of present syntax"
  (.-Force typescript/ModuleDetectionKind))
