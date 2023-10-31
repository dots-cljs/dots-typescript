(ns dots.typescript.indent-style
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/IndentStyle))

(def block (.-Block typescript/IndentStyle))

(def smart (.-Smart typescript/IndentStyle))
