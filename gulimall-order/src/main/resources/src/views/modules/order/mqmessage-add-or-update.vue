<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="${column.comments}" prop="content">
      <el-input v-model="dataForm.content" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="toExchange">
      <el-input v-model="dataForm.toExchange" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="classType">
      <el-input v-model="dataForm.classType" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="messageStatus">
      <el-input v-model="dataForm.messageStatus" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder="${column.comments}"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          messageId: 0,
          content: '',
          toExchange: '',
          classType: '',
          messageStatus: '',
          createTime: '',
          updateTime: ''
        },
        dataRule: {
          content: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          toExchange: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          classType: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          messageStatus: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.messageId = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.messageId) {
            this.$http({
              url: this.$http.adornUrl(`/order/mqmessage/info/${this.dataForm.messageId}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.content = data.mqMessage.content
                this.dataForm.toExchange = data.mqMessage.toExchange
                this.dataForm.classType = data.mqMessage.classType
                this.dataForm.messageStatus = data.mqMessage.messageStatus
                this.dataForm.createTime = data.mqMessage.createTime
                this.dataForm.updateTime = data.mqMessage.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/order/mqmessage/${!this.dataForm.messageId ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'messageId': this.dataForm.messageId || undefined,
                'content': this.dataForm.content,
                'toExchange': this.dataForm.toExchange,
                'classType': this.dataForm.classType,
                'messageStatus': this.dataForm.messageStatus,
                'createTime': this.dataForm.createTime,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
