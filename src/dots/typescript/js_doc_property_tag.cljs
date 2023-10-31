(ns dots.typescript.js-doc-property-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  ^js [js-doc-property-tag]
  (.-kind ^js js-doc-property-tag))

(defn parent
  ^js [js-doc-property-tag]
  (.-parent ^js js-doc-property-tag))

(defn name
  ^js [js-doc-property-tag]
  (.-name ^js js-doc-property-tag))

(defn type-expression
  ^js [js-doc-property-tag]
  (.-typeExpression ^js js-doc-property-tag))

(defn name-first?
  "Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like"
  ^js [js-doc-property-tag]
  (.-isNameFirst ^js js-doc-property-tag))

(defn bracketed?
  ^js [js-doc-property-tag]
  (.-isBracketed ^js js-doc-property-tag))

(defn tag-name
  ^js [js-doc-property-tag]
  (.-tagName ^js js-doc-property-tag))

(defn comment
  ^js [js-doc-property-tag]
  (.-comment ^js js-doc-property-tag))

(defn flags
  ^js [js-doc-property-tag]
  (.-flags ^js js-doc-property-tag))

(defn source-file
  ^js [js-doc-property-tag]
  (.getSourceFile ^js js-doc-property-tag))

(defn child-count
  (^js [js-doc-property-tag]
   (.getChildCount ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getChildCount ^js js-doc-property-tag source-file)))

(defn child-at
  (^js [js-doc-property-tag index]
   (.getChildAt ^js js-doc-property-tag index))
  (^js [js-doc-property-tag index source-file]
   (.getChildAt ^js js-doc-property-tag index source-file)))

(defn children
  (^js [js-doc-property-tag]
   (.getChildren ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getChildren ^js js-doc-property-tag source-file)))

(defn start
  (^js [js-doc-property-tag]
   (.getStart ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getStart ^js js-doc-property-tag source-file))
  (^js [js-doc-property-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-property-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-property-tag]
  (.getFullStart ^js js-doc-property-tag))

(defn get-end
  ^js [js-doc-property-tag]
  (.getEnd ^js js-doc-property-tag))

(defn width
  (^js [js-doc-property-tag]
   (.getWidth ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getWidth ^js js-doc-property-tag source-file)))

(defn full-width
  ^js [js-doc-property-tag]
  (.getFullWidth ^js js-doc-property-tag))

(defn leading-trivia-width
  (^js [js-doc-property-tag]
   (.getLeadingTriviaWidth ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-property-tag source-file)))

(defn full-text
  (^js [js-doc-property-tag]
   (.getFullText ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getFullText ^js js-doc-property-tag source-file)))

(defn text
  (^js [js-doc-property-tag]
   (.getText ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getText ^js js-doc-property-tag source-file)))

(defn first-token
  (^js [js-doc-property-tag]
   (.getFirstToken ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getFirstToken ^js js-doc-property-tag source-file)))

(defn last-token
  (^js [js-doc-property-tag]
   (.getLastToken ^js js-doc-property-tag))
  (^js [js-doc-property-tag source-file]
   (.getLastToken ^js js-doc-property-tag source-file)))

(defn for-each-child
  (^js [js-doc-property-tag cb-node]
   (.forEachChild ^js js-doc-property-tag cb-node))
  (^js [js-doc-property-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-property-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-property-tag]
  (.-decorators ^js js-doc-property-tag))

(defn modifiers
  ^js [js-doc-property-tag]
  (.-modifiers ^js js-doc-property-tag))

(defn pos
  ^js [js-doc-property-tag]
  (.-pos ^js js-doc-property-tag))

(defn end
  ^js [js-doc-property-tag]
  (.-end ^js js-doc-property-tag))
