(ns dots.typescript.element-flags
  (:refer-clojure :exclude [rest])
  (:require ["typescript" :as typescript]))

(def required (.-Required typescript/ElementFlags))

(def optional (.-Optional typescript/ElementFlags))

(def rest (.-Rest typescript/ElementFlags))

(def variadic (.-Variadic typescript/ElementFlags))

(def fixed (.-Fixed typescript/ElementFlags))

(def variable (.-Variable typescript/ElementFlags))

(def non-required (.-NonRequired typescript/ElementFlags))

(def non-rest (.-NonRest typescript/ElementFlags))
