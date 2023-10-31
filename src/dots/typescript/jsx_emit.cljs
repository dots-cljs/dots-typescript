(ns dots.typescript.jsx-emit
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/JsxEmit))

(def preserve (.-Preserve typescript/JsxEmit))

(def react (.-React typescript/JsxEmit))

(def react-native (.-ReactNative typescript/JsxEmit))

(def react-jsx (.-ReactJSX typescript/JsxEmit))

(def react-jsx-dev (.-ReactJSXDev typescript/JsxEmit))
