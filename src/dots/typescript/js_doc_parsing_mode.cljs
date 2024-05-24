(ns dots.typescript.js-doc-parsing-mode
  (:require ["typescript" :as typescript]))

(def parse-all
  "Always parse JSDoc comments and include them in the AST.
   
   This is the default if no mode is provided."
  (.-ParseAll typescript/JSDocParsingMode))

(def parse-none
  "Never parse JSDoc comments, mo matter the file type."
  (.-ParseNone typescript/JSDocParsingMode))

(def parse-for-type-errors
  "Parse only JSDoc comments which are needed to provide correct type errors.
   
   This will always parse JSDoc in non-TS files, but only parse JSDoc comments
   containing `@see` and `@link` in TS files."
  (.-ParseForTypeErrors typescript/JSDocParsingMode))

(def parse-for-type-info
  "Parse only JSDoc comments which are needed to provide correct type info.
   
   This will always parse JSDoc in non-TS files, but never in TS files.
   
   Note: Do not use this mode if you require accurate type errors; use {@link ParseForTypeErrors } instead."
  (.-ParseForTypeInfo typescript/JSDocParsingMode))
