(ns dots.typescript.language-variant
  (:require ["typescript" :as typescript]))

(def standard (.-Standard typescript/LanguageVariant))

(def jsx (.-JSX typescript/LanguageVariant))
