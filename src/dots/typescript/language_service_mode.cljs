(ns dots.typescript.language-service-mode
  (:require ["typescript" :as typescript]))

(def semantic (.-Semantic typescript/LanguageServiceMode))

(def partial-semantic (.-PartialSemantic typescript/LanguageServiceMode))

(def syntactic (.-Syntactic typescript/LanguageServiceMode))
