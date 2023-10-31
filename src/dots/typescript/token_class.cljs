(ns dots.typescript.token-class
  (:refer-clojure :exclude [comment keyword])
  (:require ["typescript" :as typescript]))

(def punctuation (.-Punctuation typescript/TokenClass))

(def keyword (.-Keyword typescript/TokenClass))

(def operator (.-Operator typescript/TokenClass))

(def comment (.-Comment typescript/TokenClass))

(def whitespace (.-Whitespace typescript/TokenClass))

(def identifier (.-Identifier typescript/TokenClass))

(def number-literal (.-NumberLiteral typescript/TokenClass))

(def big-int-literal (.-BigIntLiteral typescript/TokenClass))

(def string-literal (.-StringLiteral typescript/TokenClass))

(def reg-exp-literal (.-RegExpLiteral typescript/TokenClass))
