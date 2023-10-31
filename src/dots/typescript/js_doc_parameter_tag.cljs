(ns dots.typescript.js-doc-parameter-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  ^js [js-doc-parameter-tag]
  (.-kind ^js js-doc-parameter-tag))

(defn parent
  ^js [js-doc-parameter-tag]
  (.-parent ^js js-doc-parameter-tag))

(defn name
  ^js [js-doc-parameter-tag]
  (.-name ^js js-doc-parameter-tag))

(defn type-expression
  ^js [js-doc-parameter-tag]
  (.-typeExpression ^js js-doc-parameter-tag))

(defn name-first?
  "Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like"
  ^js [js-doc-parameter-tag]
  (.-isNameFirst ^js js-doc-parameter-tag))

(defn bracketed?
  ^js [js-doc-parameter-tag]
  (.-isBracketed ^js js-doc-parameter-tag))

(defn tag-name
  ^js [js-doc-parameter-tag]
  (.-tagName ^js js-doc-parameter-tag))

(defn comment
  ^js [js-doc-parameter-tag]
  (.-comment ^js js-doc-parameter-tag))

(defn flags
  ^js [js-doc-parameter-tag]
  (.-flags ^js js-doc-parameter-tag))

(defn source-file
  ^js [js-doc-parameter-tag]
  (.getSourceFile ^js js-doc-parameter-tag))

(defn child-count
  (^js [js-doc-parameter-tag]
   (.getChildCount ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getChildCount ^js js-doc-parameter-tag source-file)))

(defn child-at
  (^js [js-doc-parameter-tag index]
   (.getChildAt ^js js-doc-parameter-tag index))
  (^js [js-doc-parameter-tag index source-file]
   (.getChildAt ^js js-doc-parameter-tag index source-file)))

(defn children
  (^js [js-doc-parameter-tag]
   (.getChildren ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getChildren ^js js-doc-parameter-tag source-file)))

(defn start
  (^js [js-doc-parameter-tag]
   (.getStart ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getStart ^js js-doc-parameter-tag source-file))
  (^js [js-doc-parameter-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-parameter-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-parameter-tag]
  (.getFullStart ^js js-doc-parameter-tag))

(defn get-end
  ^js [js-doc-parameter-tag]
  (.getEnd ^js js-doc-parameter-tag))

(defn width
  (^js [js-doc-parameter-tag]
   (.getWidth ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getWidth ^js js-doc-parameter-tag source-file)))

(defn full-width
  ^js [js-doc-parameter-tag]
  (.getFullWidth ^js js-doc-parameter-tag))

(defn leading-trivia-width
  (^js [js-doc-parameter-tag]
   (.getLeadingTriviaWidth ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-parameter-tag source-file)))

(defn full-text
  (^js [js-doc-parameter-tag]
   (.getFullText ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getFullText ^js js-doc-parameter-tag source-file)))

(defn text
  (^js [js-doc-parameter-tag]
   (.getText ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getText ^js js-doc-parameter-tag source-file)))

(defn first-token
  (^js [js-doc-parameter-tag]
   (.getFirstToken ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getFirstToken ^js js-doc-parameter-tag source-file)))

(defn last-token
  (^js [js-doc-parameter-tag]
   (.getLastToken ^js js-doc-parameter-tag))
  (^js [js-doc-parameter-tag source-file]
   (.getLastToken ^js js-doc-parameter-tag source-file)))

(defn for-each-child
  (^js [js-doc-parameter-tag cb-node]
   (.forEachChild ^js js-doc-parameter-tag cb-node))
  (^js [js-doc-parameter-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-parameter-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-parameter-tag]
  (.-decorators ^js js-doc-parameter-tag))

(defn modifiers
  ^js [js-doc-parameter-tag]
  (.-modifiers ^js js-doc-parameter-tag))

(defn pos
  ^js [js-doc-parameter-tag]
  (.-pos ^js js-doc-parameter-tag))

(defn end
  ^js [js-doc-parameter-tag]
  (.-end ^js js-doc-parameter-tag))
