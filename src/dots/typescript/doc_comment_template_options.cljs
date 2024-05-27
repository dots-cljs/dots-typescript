(ns dots.typescript.doc-comment-template-options)

(defn generate-return-in-doc-template?
  "**Returns:** `boolean | undefined`"
  ^js [doc-comment-template-options]
  (.-generateReturnInDocTemplate ^js doc-comment-template-options))
