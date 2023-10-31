(ns dots.typescript.end-of-line-state
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/EndOfLineState))

(def in-multi-line-comment-trivia (.-InMultiLineCommentTrivia typescript/EndOfLineState))

(def in-single-quote-string-literal (.-InSingleQuoteStringLiteral typescript/EndOfLineState))

(def in-double-quote-string-literal (.-InDoubleQuoteStringLiteral typescript/EndOfLineState))

(def in-template-head-or-no-substitution-template (.-InTemplateHeadOrNoSubstitutionTemplate typescript/EndOfLineState))

(def in-template-middle-or-tail (.-InTemplateMiddleOrTail typescript/EndOfLineState))

(def in-template-substitution-position (.-InTemplateSubstitutionPosition typescript/EndOfLineState))
