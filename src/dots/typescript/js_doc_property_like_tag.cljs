(ns dots.typescript.js-doc-property-like-tag
  (:refer-clojure :exclude [comment name]))

(defn parent
  ^js [js-doc-property-like-tag]
  (.-parent ^js js-doc-property-like-tag))

(defn name
  ^js [js-doc-property-like-tag]
  (.-name ^js js-doc-property-like-tag))

(defn type-expression
  ^js [js-doc-property-like-tag]
  (.-typeExpression ^js js-doc-property-like-tag))

(defn name-first?
  "Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like"
  ^js [js-doc-property-like-tag]
  (.-isNameFirst ^js js-doc-property-like-tag))

(defn bracketed?
  ^js [js-doc-property-like-tag]
  (.-isBracketed ^js js-doc-property-like-tag))

(defn tag-name
  ^js [js-doc-property-like-tag]
  (.-tagName ^js js-doc-property-like-tag))

(defn comment
  ^js [js-doc-property-like-tag]
  (.-comment ^js js-doc-property-like-tag))

(defn kind
  ^js [js-doc-property-like-tag]
  (.-kind ^js js-doc-property-like-tag))

(defn flags
  ^js [js-doc-property-like-tag]
  (.-flags ^js js-doc-property-like-tag))

(defn source-file
  ^js [js-doc-property-like-tag]
  (.getSourceFile ^js js-doc-property-like-tag))

(defn child-count
  (^js [js-doc-property-like-tag]
   (.getChildCount ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getChildCount ^js js-doc-property-like-tag source-file)))

(defn child-at
  (^js [js-doc-property-like-tag index]
   (.getChildAt ^js js-doc-property-like-tag index))
  (^js [js-doc-property-like-tag index source-file]
   (.getChildAt ^js js-doc-property-like-tag index source-file)))

(defn children
  (^js [js-doc-property-like-tag]
   (.getChildren ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getChildren ^js js-doc-property-like-tag source-file)))

(defn start
  (^js [js-doc-property-like-tag]
   (.getStart ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getStart ^js js-doc-property-like-tag source-file))
  (^js [js-doc-property-like-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-property-like-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-property-like-tag]
  (.getFullStart ^js js-doc-property-like-tag))

(defn get-end
  ^js [js-doc-property-like-tag]
  (.getEnd ^js js-doc-property-like-tag))

(defn width
  (^js [js-doc-property-like-tag]
   (.getWidth ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getWidth ^js js-doc-property-like-tag source-file)))

(defn full-width
  ^js [js-doc-property-like-tag]
  (.getFullWidth ^js js-doc-property-like-tag))

(defn leading-trivia-width
  (^js [js-doc-property-like-tag]
   (.getLeadingTriviaWidth ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-property-like-tag source-file)))

(defn full-text
  (^js [js-doc-property-like-tag]
   (.getFullText ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getFullText ^js js-doc-property-like-tag source-file)))

(defn text
  (^js [js-doc-property-like-tag]
   (.getText ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getText ^js js-doc-property-like-tag source-file)))

(defn first-token
  (^js [js-doc-property-like-tag]
   (.getFirstToken ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getFirstToken ^js js-doc-property-like-tag source-file)))

(defn last-token
  (^js [js-doc-property-like-tag]
   (.getLastToken ^js js-doc-property-like-tag))
  (^js [js-doc-property-like-tag source-file]
   (.getLastToken ^js js-doc-property-like-tag source-file)))

(defn for-each-child
  (^js [js-doc-property-like-tag cb-node]
   (.forEachChild ^js js-doc-property-like-tag cb-node))
  (^js [js-doc-property-like-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-property-like-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-property-like-tag]
  (.-decorators ^js js-doc-property-like-tag))

(defn modifiers
  ^js [js-doc-property-like-tag]
  (.-modifiers ^js js-doc-property-like-tag))

(defn pos
  ^js [js-doc-property-like-tag]
  (.-pos ^js js-doc-property-like-tag))

(defn end
  ^js [js-doc-property-like-tag]
  (.-end ^js js-doc-property-like-tag))
