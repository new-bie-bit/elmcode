<template>
	<div class="wrapper">

		<!-- header部分 -->
		<header>
			<p></p>
		</header>

		<!-- 表单部分 -->
		<ul class="form-box">
			<li>
				<div class="content">
					糟糕，网络太拥挤了...
				</div>
			</li>
			<li>
				<div class="back">
					<a @click="goBack()">返回重试</a>
				</div>
			</li>
		</ul>
		<!-- 底部菜单部分 -->
		<Footer></Footer>

	</div>
</template>

<script>
	import Footer from '../components/Footer.vue';

	export default{
		name:'warning',
		data(){
			return{
				msg:"警告页面"
			}
		},
		created() {
		},
		components:{
			Footer
		},
		methods:{
			goBack(){
				this.$router.back();
			}
		}
	}
</script>

<style scoped>
	/****************** 总容器 ******************/
	.wrapper {
		width: 100%;
		height: 100%;
	}

	/****************** header部分 ******************/
	.wrapper header {
		width: 100%;
		height: 12vw;
		background-color: #ffffff;
		color: #fff;
		font-size: 4.8vw;

		position: fixed;
		left: 0;
		top: 0;
		z-index: 1000;

		display: flex;
		justify-content: center;
		align-items: center;
	}
	/****************** 表单部分 ******************/
	.wrapper .form-box {
		width: 100%;
		margin-top: 12vw;
	}

	.wrapper .form-box li {
		box-sizing: border-box;
		padding: 4vw 3vw 0 3vw;
		display: flex;
		align-items: center;
	}
	.wrapper .form-box li .content {
		flex: 1;
	}

	.wrapper .form-box li .content {
		border: none;
		outline: none;
		width: 100%;
		font-size: 8vw;
		text-align: center;
	}

	.wrapper .form-box li .back{
		padding-top: 20px;
		width: 100%;
		font-size: 5vw;
		text-align: center;
	}

</style>
