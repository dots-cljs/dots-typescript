(ns dots.typescript.identifier)

(defn kind
  ^js [identifier]
  (.-kind ^js identifier))

(defn escaped-text
  "Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
   Text of identifier, but if the identifier begins with two underscores, this will begin with three."
  ^js [identifier]
  (.-escapedText ^js identifier))

(defn original-keyword-kind
  ^js [identifier]
  (.-originalKeywordKind ^js identifier))

(defn in-js-doc-namespace?
  ^js [identifier]
  (.-isInJSDocNamespace ^js identifier))

(defn set-is-in-js-doc-namespace!
  ^js [identifier value]
  (set! (.-isInJSDocNamespace ^js identifier) value))

(defn text
  ^js [identifier]
  (.-text ^js identifier))

(defn flags
  ^js [identifier]
  (.-flags ^js identifier))

(defn parent
  ^js [identifier]
  (.-parent ^js identifier))

(defn source-file
  ^js [identifier]
  (.getSourceFile ^js identifier))

(defn child-count
  (^js [identifier]
   (.getChildCount ^js identifier))
  (^js [identifier source-file]
   (.getChildCount ^js identifier source-file)))

(defn child-at
  (^js [identifier index]
   (.getChildAt ^js identifier index))
  (^js [identifier index source-file]
   (.getChildAt ^js identifier index source-file)))

(defn children
  (^js [identifier]
   (.getChildren ^js identifier))
  (^js [identifier source-file]
   (.getChildren ^js identifier source-file)))

(defn start
  (^js [identifier]
   (.getStart ^js identifier))
  (^js [identifier source-file]
   (.getStart ^js identifier source-file))
  (^js [identifier source-file include-js-doc-comment?]
   (.getStart ^js identifier source-file include-js-doc-comment?)))

(defn full-start
  ^js [identifier]
  (.getFullStart ^js identifier))

(defn get-end
  ^js [identifier]
  (.getEnd ^js identifier))

(defn width
  (^js [identifier]
   (.getWidth ^js identifier))
  (^js [identifier source-file]
   (.getWidth ^js identifier source-file)))

(defn full-width
  ^js [identifier]
  (.getFullWidth ^js identifier))

(defn leading-trivia-width
  (^js [identifier]
   (.getLeadingTriviaWidth ^js identifier))
  (^js [identifier source-file]
   (.getLeadingTriviaWidth ^js identifier source-file)))

(defn full-text
  (^js [identifier]
   (.getFullText ^js identifier))
  (^js [identifier source-file]
   (.getFullText ^js identifier source-file)))

(defn get-text
  (^js [identifier]
   (.getText ^js identifier))
  (^js [identifier source-file]
   (.getText ^js identifier source-file)))

(defn first-token
  (^js [identifier]
   (.getFirstToken ^js identifier))
  (^js [identifier source-file]
   (.getFirstToken ^js identifier source-file)))

(defn last-token
  (^js [identifier]
   (.getLastToken ^js identifier))
  (^js [identifier source-file]
   (.getLastToken ^js identifier source-file)))

(defn for-each-child
  (^js [identifier cb-node]
   (.forEachChild ^js identifier cb-node))
  (^js [identifier cb-node cb-node-array]
   (.forEachChild ^js identifier cb-node cb-node-array)))

(defn decorators
  ^js [identifier]
  (.-decorators ^js identifier))

(defn modifiers
  ^js [identifier]
  (.-modifiers ^js identifier))

(defn pos
  ^js [identifier]
  (.-pos ^js identifier))

(defn end
  ^js [identifier]
  (.-end ^js identifier))
