(ns dots.typescript.token-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/TokenFlags))

(def scientific (.-Scientific typescript/TokenFlags))

(def octal (.-Octal typescript/TokenFlags))

(def hex-specifier (.-HexSpecifier typescript/TokenFlags))

(def binary-specifier (.-BinarySpecifier typescript/TokenFlags))

(def octal-specifier (.-OctalSpecifier typescript/TokenFlags))
